import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { SearchProductBynameComponent } from './search-product-byname.component';

describe('SearchProductBynameComponent', () => {
  let component: SearchProductBynameComponent;
  let fixture: ComponentFixture<SearchProductBynameComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ SearchProductBynameComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(SearchProductBynameComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
