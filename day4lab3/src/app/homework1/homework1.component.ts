import { Component, OnInit } from '@angular/core';
import { FormControl } from '@angular/forms';
import { FormBuilder } from '@angular/forms';
import { Validators } from '@angular/forms';
import { FormArray } from '@angular/forms';

@Component({
  selector: 'app-homework1',
  templateUrl: './homework1.component.html',
  styleUrls: ['./homework1.component.css']
})
export class Homework1Component implements OnInit {

  profileForm = this.fb.group({
    name: ['', [Validators.required]],
    email: ['', [Validators.required, Validators.email]],
    postal: ['', [Validators.required, Validators.minLength(8)]],
    comments: ['']
  });

  constructor(private fb: FormBuilder) { }


  onSubmit() {
    // TODO: Use EventEmitter with form value
    console.warn(this.profileForm.value);
    alert(JSON.stringify(this.profileForm.value));
  }

  ngOnInit(): void {
  }

}
