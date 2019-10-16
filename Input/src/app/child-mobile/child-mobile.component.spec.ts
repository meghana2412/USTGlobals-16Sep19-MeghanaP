import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ChildMobileComponent } from './child-mobile.component';

describe('ChildMobileComponent', () => {
  let component: ChildMobileComponent;
  let fixture: ComponentFixture<ChildMobileComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ChildMobileComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ChildMobileComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
