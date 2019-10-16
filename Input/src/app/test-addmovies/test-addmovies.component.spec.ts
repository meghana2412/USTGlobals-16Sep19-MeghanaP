import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { TestAddmoviesComponent } from './test-addmovies.component';

describe('TestAddmoviesComponent', () => {
  let component: TestAddmoviesComponent;
  let fixture: ComponentFixture<TestAddmoviesComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ TestAddmoviesComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(TestAddmoviesComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
