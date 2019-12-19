import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { RemovelibrarianComponent } from './removelibrarian.component';

describe('RemovelibrarianComponent', () => {
  let component: RemovelibrarianComponent;
  let fixture: ComponentFixture<RemovelibrarianComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ RemovelibrarianComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(RemovelibrarianComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
