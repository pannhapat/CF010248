// import { Component, OnInit } from '@angular/core';
// import { FormControl } from '@angular/forms';
// import { FormBuilder } from '@angular/forms';
// import { Validators } from '@angular/forms';
// import { FormArray } from '@angular/forms';

// @Component({
//   selector: 'app-my-form',
//   templateUrl: './my-form.component.html',
//   styleUrls: ['./my-form.component.css']
// })
// export class MyFormComponent implements OnInit {

//   profileForm = this.fb.group({
//     phone: ['', Validators.required],
//     email: [''],
//     password: [''],
//     confirmpassword: [''],
//     address: this.fb.group({
//       street: [''],
//       city: [''],
//       state: [''],
//       zip: ['']
//     }),
//     aliases: this.fb.array([
//       this.fb.control('')
//     ])
//   });

//   constructor(private fb: FormBuilder) { }

//   ngOnInit(): void {
//   }
//   updateProfile() {
//     this.profileForm.patchValue({
//       firstName: 'Nancy',
//       address: {
//         street: '123 Drew Street'
//       }
//     });
//   }
//   get aliases() {
//     return this.profileForm.get('aliases') as FormArray;
//   }
//   addAlias() {
//     this.aliases.push(this.fb.control(''));
//   }

//   onSubmit() {
//     // TODO: Use EventEmitter with form value
//     console.warn(this.profileForm.value);
//   }

// }
