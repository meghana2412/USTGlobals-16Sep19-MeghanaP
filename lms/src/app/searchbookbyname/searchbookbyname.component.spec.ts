import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { SearchbookbynameComponent } from './searchbookbyname.component';

describe('SearchbookbynameComponent', () => {
  let component: SearchbookbynameComponent;
  let fixture: ComponentFixture<SearchbookbynameComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ SearchbookbynameComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(SearchbookbynameComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
