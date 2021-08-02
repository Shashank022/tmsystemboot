import { Component, OnInit } from '@angular/core';
import { HttpClientModule, HttpClient } from '@angular/common/http';
import  model from '../event';
import event from "../event";

@Component({
  selector: 'app-events',
  templateUrl: './events.component.html',
  styleUrls: ['./events.component.css']
})
export class EventsComponent {

  private APP_URL: string = "http://localhost:5008/";
  public response: any;
  public isVisible: boolean = false;

  constructor(private httpClient: HttpClient) {
  }

  ngOnInit(): void {
    this.httpClient.get(this.APP_URL + 'events').subscribe(
      data => {
        this.response = data;
        console.log(data);
      },
      error => {
        console.log('Error occured', error);
      }
    );
  }

  getEventDetails(eventid) {
    return new Promise((resolve, reject) => {
      let error = false;
      if (!error) {
        resolve(
          this.httpClient.get(this.APP_URL + "/events/" + eventid).subscribe(
            data => {
              this.response = data;
              this.isVisible = true;
              console.log(data);
            }));
      } else {
        reject('Error occured');
      };
    }).then(function (value) {
      console.log("We have sucessfully ompleted the getEventDetails.....!!!");
    });

  };

  updateEventDetails(eventid) {

    return new Promise((resolve, reject) => {
      let error = false;
      const body=JSON.stringify(event);
      if (!error) {

        resolve(
          this.httpClient.get(this.APP_URL + "/events/" + eventid).subscribe(
            data => {
              this.response = data;
              this.isVisible = true;
              console.log(data);
            }));
      } else {
        reject('Error occured');
      };
    }).then(function (value) {
      console.log("We have sucessfully ompleted the updateEventDetails.....!!!");
    });

  };

  deleteEvent(eventid) {
    this.httpClient.delete(this.APP_URL + "/events/" + eventid).subscribe(
      data => {
        this.response = data;
        console.log(data);
      },
      error => {
        console.log('Error occured', error);
      }
    );
    this.refreshPage();
  }

  refreshPage() {
    document.defaultView.location.reload();
  }

  formatDate(date) {
    var date1 = new Date(date);
    var newdate = (date1.getMonth() + 1) + '/' + date1.getDate() + '/' + date1.getFullYear();
    return newdate;
  }

}
