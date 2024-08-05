import { ComponentFixture, TestBed } from '@angular/core/testing';

import { FetchproductComponent } from './fetchproduct.component';

describe('FetchproductComponent', () => {
  let component: FetchproductComponent;
  let fixture: ComponentFixture<FetchproductComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [FetchproductComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(FetchproductComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
