import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ChildBikeComponent } from './child-bike.component';

describe('ChildBikeComponent', () => {
  let component: ChildBikeComponent;
  let fixture: ComponentFixture<ChildBikeComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ChildBikeComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ChildBikeComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
