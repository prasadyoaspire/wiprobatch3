import { ComponentFixture, TestBed } from '@angular/core/testing';

import { FetchallproductsComponent } from './fetchallproducts.component';

describe('FetchallproductsComponent', () => {
  let component: FetchallproductsComponent;
  let fixture: ComponentFixture<FetchallproductsComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [FetchallproductsComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(FetchallproductsComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
