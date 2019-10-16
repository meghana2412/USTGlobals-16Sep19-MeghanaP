import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { MeghanaComponent } from './meghana.component';

describe('MeghanaComponent', () => {
  let component: MeghanaComponent;
  let fixture: ComponentFixture<MeghanaComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ MeghanaComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(MeghanaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
