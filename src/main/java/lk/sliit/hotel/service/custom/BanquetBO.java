package lk.sliit.hotel.service.custom;

import lk.sliit.hotel.dto.banquet.BanquetAddDTO;
import lk.sliit.hotel.dto.banquet.BanquetBillDTO;
import lk.sliit.hotel.dto.banquet.BanquetCustomerDTO;
import lk.sliit.hotel.dto.banquet.BanquetOrderDTO;

import lk.sliit.hotel.service.SuperBO;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;

@Service
public interface BanquetBO extends SuperBO {

    BanquetOrderDTO findTopBanquetId();

//    BanquetCustomerDTO findTopbCustomerId();

    void saveBanquet(BanquetAddDTO banquetAddDTO);


    int checkAvailability(Date date);

    int checkHallOneAvailability(Date date);

    int checkHallTwoAvailabilityCheck(Date date);

    BanquetCustomerDTO findTopCustomerId();

    List<BanquetCustomerDTO> findAllCustomers();

//    BanquetBillDTO findTopBiiId();

    List<BanquetAddDTO> findBanquetBill();

    BanquetBillDTO findTopBanquetBillId();

    List<BanquetAddDTO> findAllBanquet();

    List<BanquetAddDTO> findNextBanquets();

    List<BanquetAddDTO> findTodayBanquets();


    List<BanquetAddDTO> findConfirmedBanquet();

    List<BanquetAddDTO> findUnconfirmedBanquet();

    void updateBill(BanquetAddDTO banquetAddDTO);

    void updateBanquetStatus(int orderId);

    void updateBanquetStatusAsFinished(int orderId);

    void updateBanquetStatusToCancel(int orderId);

    int checkHallOneAvailabilityAndGetBanquetId(Date date);

    void updateBanquetDetails(BanquetAddDTO banquetAddDTO);

    int checkHallTwoAvailabilityAndGetBanquetId(Date date);


    List<BanquetAddDTO> findCheckDateBanquets(Date date);
}

