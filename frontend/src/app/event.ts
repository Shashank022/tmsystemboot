export class event {

    id: number;
    event_name: string;
    created_by: string;
    created_date: string;
    updated_by: string;
    team_id: string;
  
    constructor(event) {
        {
          this.id = event.id;
          this.event_name = event.event_name || '';
          this.created_by = event.created_by || '';
          this.created_date = event.created_date || '';
          this.updated_by = event.updated_by || '';
          this.team_id = event.team_id || '';
        }
    }
}


export default event;