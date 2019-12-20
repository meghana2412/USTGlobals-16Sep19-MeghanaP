import { async, ComponentFixture, TestBed } from '@angular/core/testing';

import { SearchAllProductsComponent } from './search-all-products.component';

describe('SearchAllProductsComponent', () => {
  let component: SearchAllProductsComponent;
  let fixture: ComponentFixture<SearchAllProductsComponent>;

  beforeEach(async(() => {
    TestBed.configureTestingModule({
      declarations: [ SearchAllProductsComponent ]
    })
    .compileComponents();
  }));

  beforeEach(() => {
    fixture = TestBed.createComponent(SearchAllProductsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
