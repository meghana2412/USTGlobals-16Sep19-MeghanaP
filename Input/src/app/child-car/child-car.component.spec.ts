import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ChildCarComponent } from './child-car.component';

describe('ChildCarComponent', () => {
  let component: ChildCarComponent;
  let fixture: ComponentFixture<ChildCarComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ChildCarComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ChildCarComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
