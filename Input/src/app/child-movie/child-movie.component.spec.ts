import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { ChildMovieComponent } from './child-movie.component';

describe('ChildMovieComponent', () => {
  let component: ChildMovieComponent;
  let fixture: ComponentFixture<ChildMovieComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ ChildMovieComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(ChildMovieComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
