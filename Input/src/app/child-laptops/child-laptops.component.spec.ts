import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ChildLaptopsComponent } from './child-laptops.component';

describe('ChildLaptopsComponent', () => {
  let component: ChildLaptopsComponent;
  let fixture: ComponentFixture<ChildLaptopsComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ChildLaptopsComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ChildLaptopsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
