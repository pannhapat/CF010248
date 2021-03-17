import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';
import { HttpHeaders } from '@angular/common/http';



@Component({
  selector: 'app-homework2',
  templateUrl: './homework2.component.html',
  styleUrls: ['./homework2.component.css']
})

export class Homework2Component implements OnInit {
  ratesData: any[];
  RateKeys = ['USD', 'GBP', 'EUR', 'JPY', 'BGN', 'CZK', 'DKK', 'HUF', 'PLN', 'RON', 'SEK', 'CHF', 'ISK', 'NOK', 'HRK', 'RUB', 'TRY', 'AUD', 'BRL', 'CAD', 'CNY', 'HKD', 'IDR', 'ILS', 'INR', 'KRW', 'MXN', 'MYR', 'NZD', 'PHP', 'SGD', 'THB', 'ZAR'];

  keyRate1: string;
  keyRate2: string;
  valueRate1: number;
  valueRate2: number;
  difRate: number;

  form: FormGroup;

  
  SERVER_URL = "https://api.exchangeratesapi.io/latest?convert";

  constructor(private httpClient: HttpClient, private fb: FormBuilder) {

    this.form = this.fb.group({
      money: ['', Validators.required, Validators.pattern("^[0-9]*$")],
      rateKey1: '',
      rateKey2: '',
      money2: ''
    });
  }

  

  ngOnInit(): void {
    

  }

  calRate() {
    var nummoney = this.form.get('money').value;
    var str1 = this.form.get('rateKey1').value;
    var str2 = this.form.get('rateKey2').value;
    var strurl = 'https://api.exchangeratesapi.io/latest?convert'+'?from=' + str1.toUpperCase() + '&to=' + str2.toUpperCase() + '&symbols=' + str1.toUpperCase()+ ',' + str2.toUpperCase();
    alert(strurl);
    this.httpClient.get(strurl).subscribe(result => {
      result["rates"];
      this.valueRate1 = result["rates"][str1.toUpperCase()];
      this.valueRate2 = result["rates"][str2.toUpperCase()];
      this.difRate = nummoney * (this.valueRate2 / this.valueRate1);
      // alert(this.valueRate1 +":"+ this.valueRate2);
      this.form.controls['money2'].setValue(this.difRate.toFixed(4));
    });
  }

  // getCurrencyKeys(){
  //   this.RateKeys=[];
  //   var urlkey = 'https://api.exchangeratesapi.io/latest';
  //   this.httpClient.get(urlkey).subscribe(result => {
  //     for (let obj in result["rates"]) {
  //       alert(obj);
  //       this.RateKeys.push(obj);
  //     }

  //     // for (let obj in result["rates"]) {
  //     //   this.RateKeys.push(result["rates"][obj]);
  //     // }

  //       // for (let rate in result["rates"]) {
  //       //   this.RateKeys.push(rate);
  //       //   // this.RateKeys.push(result["rates"]);
  //       // }
  //       // for (let [key, object] of Object.entries(result["rates"])) {
  //       //   this.RateKeys.push(key);
  //       // }

  //   });
  // }
}
