import { Component } from '@angular/core';

export type EditorType = 'lab3' | 'homework1'| 'homework2' ;

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'day4lab3';
  editor: EditorType = 'lab3';

  get show1() {
    return this.editor === 'lab3';
  }

  get show2() {
    return this.editor === 'homework1';
  }

  get show3() {
    return this.editor === 'homework2';
  }

  toggleEditor(type: EditorType) {
    this.editor = type;
  }

}
