import { ComponentFixture, TestBed } from '@angular/core/testing';

import { FetchallcustomerComponent } from './fetchallcustomer.component';

describe('FetchallcustomerComponent', () => {
  let component: FetchallcustomerComponent;
  let fixture: ComponentFixture<FetchallcustomerComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [FetchallcustomerComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(FetchallcustomerComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
