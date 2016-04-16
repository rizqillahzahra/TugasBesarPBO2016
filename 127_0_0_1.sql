-- phpMyAdmin SQL Dump
-- version 4.2.7.1
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: 15 Apr 2016 pada 16.49
-- Versi Server: 5.5.39
-- PHP Version: 5.4.31

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `db_transportasi_online`
--

-- --------------------------------------------------------

--
-- Struktur dari tabel `kurir`
--

CREATE TABLE IF NOT EXISTS `kurir` (
  `id_pesanan` int(9) NOT NULL,
  `deskripsi` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data untuk tabel `kurir`
--

INSERT INTO `kurir` (`id_pesanan`, `deskripsi`) VALUES
(1, 'ahahay'),
(1, 'asdsad'),
(8, 'asdasd');

-- --------------------------------------------------------

--
-- Struktur dari tabel `pelanggan`
--

CREATE TABLE IF NOT EXISTS `pelanggan` (
`id_pelanggan` int(8) NOT NULL,
  `nama` varchar(50) NOT NULL,
  `no_telepon` varchar(15) NOT NULL,
  `username` varchar(50) NOT NULL,
  `password` varchar(60) NOT NULL,
  `alamat` text NOT NULL
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=4 ;

--
-- Dumping data untuk tabel `pelanggan`
--

INSERT INTO `pelanggan` (`id_pelanggan`, `nama`, `no_telepon`, `username`, `password`, `alamat`) VALUES
(1, 'asd', '4232', 'asd', 'asd', 'asd'),
(2, 'Hafidh Fikri Rasyid', '8996024140', 'hafidhfikri', 'sitampan', 'gg. atmawigena no.82'),
(3, 'zahra', '82240203631', 'zahra1234', 'zahra1234', 'sukabirus');

-- --------------------------------------------------------

--
-- Struktur dari tabel `pengemudi`
--

CREATE TABLE IF NOT EXISTS `pengemudi` (
`id_pengemudi` int(5) NOT NULL,
  `nama` varchar(60) NOT NULL,
  `username` varchar(60) NOT NULL,
  `password` varchar(60) NOT NULL,
  `no_telepon` int(14) NOT NULL
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=2 ;

--
-- Dumping data untuk tabel `pengemudi`
--

INSERT INTO `pengemudi` (`id_pengemudi`, `nama`, `username`, `password`, `no_telepon`) VALUES
(1, 'Adi Rahman', 'adieajah', 'adieajah100', 2147483647);

-- --------------------------------------------------------

--
-- Struktur dari tabel `pesanan`
--

CREATE TABLE IF NOT EXISTS `pesanan` (
`id_pesanan` int(9) NOT NULL,
  `id_pelanggan` int(8) NOT NULL,
  `asal` varchar(40) NOT NULL,
  `tujuan` varchar(40) NOT NULL,
  `tarif` int(11) NOT NULL,
  `jarak` int(4) NOT NULL,
  `status` varchar(19) NOT NULL
) ENGINE=InnoDB  DEFAULT CHARSET=latin1 AUTO_INCREMENT=9 ;

--
-- Dumping data untuk tabel `pesanan`
--

INSERT INTO `pesanan` (`id_pesanan`, `id_pelanggan`, `asal`, `tujuan`, `tarif`, `jarak`, `status`) VALUES
(1, 2, 'Dago', 'Riau', 60000, 0, 'Pending'),
(2, 2, 'Dago', 'Riau', 60000, 0, 'Pending'),
(3, 2, 'Dago', 'Riau', 60000, 15, 'Pending'),
(4, 2, 'Dago', 'Riau', 60000, 15, 'Pending'),
(5, 2, 'Dago', 'Riau', 0, 15, 'Pending'),
(6, 2, 'Dago', 'Riau', 65000, 15, 'Pending'),
(7, 2, 'Dago', 'Riau', 65000, 15, 'Pending'),
(8, 2, 'Dago', 'Riau', 65000, 15, 'Pending');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `kurir`
--
ALTER TABLE `kurir`
 ADD KEY `fkKurir` (`id_pesanan`);

--
-- Indexes for table `pelanggan`
--
ALTER TABLE `pelanggan`
 ADD PRIMARY KEY (`id_pelanggan`);

--
-- Indexes for table `pengemudi`
--
ALTER TABLE `pengemudi`
 ADD PRIMARY KEY (`id_pengemudi`);

--
-- Indexes for table `pesanan`
--
ALTER TABLE `pesanan`
 ADD PRIMARY KEY (`id_pesanan`), ADD KEY `fkPesanan` (`id_pelanggan`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `pelanggan`
--
ALTER TABLE `pelanggan`
MODIFY `id_pelanggan` int(8) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=4;
--
-- AUTO_INCREMENT for table `pengemudi`
--
ALTER TABLE `pengemudi`
MODIFY `id_pengemudi` int(5) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT for table `pesanan`
--
ALTER TABLE `pesanan`
MODIFY `id_pesanan` int(9) NOT NULL AUTO_INCREMENT,AUTO_INCREMENT=9;
--
-- Ketidakleluasaan untuk tabel pelimpahan (Dumped Tables)
--

--
-- Ketidakleluasaan untuk tabel `kurir`
--
ALTER TABLE `kurir`
ADD CONSTRAINT `fkKurir` FOREIGN KEY (`id_pesanan`) REFERENCES `pesanan` (`id_pesanan`);

--
-- Ketidakleluasaan untuk tabel `pesanan`
--
ALTER TABLE `pesanan`
ADD CONSTRAINT `fkPesanan` FOREIGN KEY (`id_pelanggan`) REFERENCES `pelanggan` (`id_pelanggan`);

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
