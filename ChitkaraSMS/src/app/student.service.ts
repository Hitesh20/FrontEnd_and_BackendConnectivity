import { Injectable } from '@angular/core';
import {HttpClient, HttpHeaders} from '@angular/common/http';
import {Observable} from 'rxjs';
import {StudentClass} from './StudentClass';



@Injectable({
  providedIn: 'root'
})
export class StudentService {

  // private url = '/assets/data/studentDetails.json';
  private url = 'http://localhost:2020';
  private headers = new HttpHeaders({'Content-Type': 'application/json'});
  // private url = '/students';
  constructor(private http: HttpClient) { }

  getStudents(): Observable<StudentClass[]> {
      return this.http.get<StudentClass[]>(this.url + '/students');
  }
/*
  getStudent(id: number): Observable<StudentClass[]> {
    return this.http.get<StudentClass[]>(this.url + '/students/' + id, this.options).map((response: Response) => response.json());
  }*/
}
