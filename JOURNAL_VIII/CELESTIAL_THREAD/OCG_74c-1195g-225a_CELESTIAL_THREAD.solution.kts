
solution {
    puzzle = "P101"
    name = "B CI880 6T"
    arm(ARM1) {
        number = 1
        position = -5 to 5
        rotation = 5
        size = 2
    }
    arm(ARM6) {
        number = 2
        position = -5 to 6
        rotation = 5
        size = 2
    }
    arm(ARM1) {
        number = 3
        position = -5 to 7
        rotation = 5
        size = 2
    }
    arm(ARM1) {
        number = 4
        position = -4 to 7
        rotation = 5
        size = 2
    }
    arm(ARM1) {
        number = 5
        position = -6 to 2
        rotation = 0
        size = 3
    }
    arm(ARM1) {
        number = 6
        position = -6 to 1
        rotation = 0
        size = 3
    }
    arm(ARM1) {
        number = 7
        position = -5 to 0
        rotation = 0
        size = 3
    }
    arm(ARM1) {
        number = 8
        position = -5 to 1
        rotation = 0
        size = 3
    }
    arm(ARM1) {
        number = 9
        position = -3 to -1
        rotation = 5
        size = 1
    }
    arm(ARM1) {
        number = 10
        position = 0 to -4
        rotation = 8
        size = 2
    }
    arm(ARM1) {
        number = 11
        position = 1 to -5
        rotation = 8
        size = 3
    }
    arm(ARM1) {
        number = 12
        position = -4 to 0
        rotation = 5
        size = 2
    }
    arm(ARM1) {
        number = 13
        position = -4 to -2
        rotation = 6
        size = 2
    }
    arm(ARM1) {
        number = 14
        position = -5 to -2
        rotation = 6
        size = 3
    }
    arm(PISTON) {
        number = 15
        position = -2 to -4
        rotation = 7
        size = 2
    }
    arm(PISTON) {
        number = 16
        position = -2 to -3
        rotation = 7
        size = 1
    }
    arm(ARM6) {
        number = 17
        position = -1 to -3
        rotation = 2
        size = 1
    }
    arm(ARM1) {
        number = 18
        position = -5 to 3
        rotation = 0
        size = 3
    }
    arm(PISTON) {
        number = 19
        position = -3 to 4
        rotation = -1
        size = 1
    }
    arm(ARM1) {
        number = 20
        position = -3 to 0
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 21
        position = -4 to 2
        rotation = 5
        size = 3
    }
    arm(ARM1) {
        number = 22
        position = 2 to -2
        rotation = 2
        size = 3
    }
    arm(ARM1) {
        number = 23
        position = 3 to -2
        rotation = 2
        size = 3
    }
    arm(ARM1) {
        number = 24
        position = 1 to 3
        rotation = 3
        size = 3
    }
    arm(ARM1) {
        number = 25
        position = 3 to 5
        rotation = 3
        size = 2
    }
    arm(ARM1) {
        number = 26
        position = 3 to 4
        rotation = 3
        size = 2
    }
    arm(ARM1) {
        number = 27
        position = 2 to 2
        rotation = -3
        size = 3
    }
    arm(PISTON) {
        number = 28
        position = 1 to 1
        rotation = 2
        size = 3
    }
    arm(ARM1) {
        number = 29
        position = 1 to -1
        rotation = 4
        size = 2
    }
    arm(ARM1) {
        number = 30
        position = 0 to -1
        rotation = 3
        size = 1
    }
    arm(ARM1) {
        number = 31
        position = 2 to -4
        rotation = 2
        size = 3
    }
    arm(ARM1) {
        number = 32
        position = -1 to -4
        rotation = 1
        size = 3
    }
    arm(ARM1) {
        number = 33
        position = 2 to -3
        rotation = 2
        size = 3
    }
    arm(ARM1) {
        number = 34
        position = -4 to -1
        rotation = 6
        size = 3
    }
    glyph(BONDER) {
        position = -1 to 3
        rotation = 2
    }
    glyph(BONDER) {
        position = 0 to 3
        rotation = 2
    }
    glyph(BONDER) {
        position = 0 to 4
        rotation = 2
    }
    glyph(BONDER) {
        position = -1 to 2
        rotation = 0
    }
    glyph(BONDER) {
        position = 3 to 0
        rotation = 5
    }
    glyph(BONDER) {
        position = 2 to 1
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -2 to 2
        rotation = 1
    }
    glyph(CALCIFICATION) {
        position = 0 to 1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 0 to 5
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 4 to -2
        rotation = 0
    }
    glyph(PROJECTION) {
        position = -2 to 1
        rotation = 0
    }
    glyph(PROJECTION) {
        position = -2 to 0
        rotation = 0
    }
    glyph(PURIFICATION) {
        position = -2 to -1
        rotation = -1
    }
    glyph(PURIFICATION) {
        position = 1 to -2
        rotation = 3
    }
    glyph(EQUILIBRIUM) {
        position = 5 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 4 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 1 to 15
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -3 to 2
        rotation = 1
    }
    io(INFINITE) {
        index = 0
        position = -3 to 9
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -2 to -2
        rotation = 0
    }
    track {
        position = 2 to -2
        positions = listOf(0 to 0, 1 to 0, 1 to 1, 0 to 2, 0 to 1)
    }
    track {
        position = 1 to 0
        positions = listOf(0 to -1, 0 to 0, 0 to 1)
    }
    track {
        position = 2 to -3
        positions = listOf(2 to -2, 1 to -2, 0 to -1, 0 to 0, 1 to 0)
    }
    track {
        position = -7 to 3
        positions = listOf(2 to 0, 3 to -1, 3 to 0, 3 to 1)
    }
    track {
        position = -5 to 5
        positions = listOf(0 to 0, 1 to 0, 1 to 1, 1 to 2, 0 to 2, 0 to 1)
    }
    track {
        position = -5 to 2
        positions = listOf(0 to 0, -1 to 0, -1 to -1, 0 to -2, 0 to -1)
    }
    track {
        position = 3 to 2
        positions = listOf(1 to -1, 1 to 0, 0 to 1, -1 to 1, -2 to 1, -1 to 0, 0 to 0)
    }
    track {
        position = 1 to -4
        positions = listOf(0 to 0, 0 to -1, -1 to -1, -2 to 0)
    }
    track {
        position = 0 to -3
        positions = listOf(0 to 0, 0 to -1)
    }
    track {
        position = -4 to -1
        positions = listOf(0 to 2, 0 to 1, 0 to 0, 0 to -1)
    }
    track {
        position = -5 to -1
        positions = listOf(0 to 0, 0 to -1)
    }
    tape {
        parallel(
        {
            sequence(30) {
                wait(13)
                grab()
                rotateClockwise()
                reset()
                wait(9)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                grab()
                rotateCounterClockwise()
                reset()
                wait(13)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                grab()
                rotateClockwise()
                reset()
                wait(2)
                grab()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                reset()
                wait(2)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(9) {
                wait(24)
                grab()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(22) {
                wait(10)
                grab()
                back()
                pivotCounterClockwise()
                drop()
                wait(1)
                reset()
                wait(6)
                repeat()
                wait(11)
                repeat()
                wait(11)
                repeat()
                wait(11)
                repeat()
                wait(8)
                grab()
                forward()
                forward()
                pivotCounterClockwise()
                forward()
                drop()
            }
        }
        , 
        {
            sequence(23) {
                wait(12)
                back()
                grab()
                forward()
                forward()
                pivotCounterClockwise()
                forward()
                drop()
                back()
                back()
                wait(2)
                back()
                wait(2)
                grab()
                forward()
                forward()
                pivotCounterClockwise()
                forward()
                drop()
                back()
                back()
                wait(1)
                back()
                wait(2)
                grab()
                forward()
                forward()
                pivotCounterClockwise()
                forward()
                drop()
                back()
                back()
                wait(1)
                back()
                wait(2)
                grab()
                forward()
                forward()
                pivotCounterClockwise()
                forward()
                drop()
                back()
                back()
                wait(1)
                back()
                wait(2)
                grab()
                forward()
                forward()
                pivotCounterClockwise()
                forward()
                drop()
                forward()
            }
        }
        , 
        {
            sequence(1) {
                wait(2)
                grab()
                forward()
                forward()
                drop()
                forward()
                wait(1)
                forward()
                forward()
                wait(1)
                reset()
                wait(2)
                grab()
                forward()
                forward()
                wait(1)
                forward()
                drop()
                forward()
                forward()
                wait(1)
                reset()
                wait(2)
                grab()
                forward()
                forward()
                wait(2)
                forward()
                drop()
                forward()
                reset()
                wait(3)
                grab()
                forward()
                forward()
                wait(2)
                forward()
                drop()
                forward()
                reset()
                wait(3)
                grab()
                forward()
                forward()
                wait(2)
                forward()
                drop()
                forward()
                reset()
                wait(3)
                grab()
                forward()
                forward()
                wait(2)
                forward()
                drop()
                wait(1)
                forward()
                wait(1)
                forward()
                wait(2)
                extendTape()
            }
        }
        , 
        {
            sequence(3) {
                wait(5)
                forward()
                wait(1)
                forward()
                grab()
                forward()
                wait(1)
                forward()
                wait(1)
                forward()
                reset()
                wait(2)
                repeat()
                wait(11)
                repeat()
                wait(11)
                repeat()
                wait(11)
                repeat()
                wait(11)
                forward()
                wait(1)
                forward()
                grab()
                forward()
                forward()
                wait(1)
                forward()
                drop()
            }
        }
        , 
        {
            sequence(4) {
                wait(5)
                forward()
                wait(1)
                forward()
                wait(1)
                forward()
                grab()
                forward()
                wait(1)
                forward()
                reset()
                wait(2)
                repeat()
                wait(11)
                repeat()
                wait(11)
                repeat()
                wait(11)
                repeat()
                wait(11)
                forward()
                wait(1)
                forward()
                wait(1)
                forward()
                grab()
                forward()
                forward()
                drop()
            }
        }
        , 
        {
            sequence(6) {
                wait(1)
                back()
                grab()
                back()
                back()
                wait(1)
                back()
                drop()
                back()
                back()
                grab()
                back()
                back()
                drop()
                back()
                back()
                wait(1)
                back()
                grab()
                back()
                back()
                back()
                drop()
                back()
                wait(1)
                back()
                grab()
                back()
                back()
                drop()
                back()
                back()
                wait(1)
                back()
                grab()
                back()
                back()
                back()
                drop()
                back()
                wait(1)
                back()
                grab()
                back()
                back()
                back()
                drop()
                back()
                wait(1)
                back()
                grab()
                back()
                back()
                back()
                drop()
                back()
                wait(1)
                back()
                grab()
                back()
                back()
                wait(1)
                back()
                drop()
                back()
                back()
                grab()
                back()
                back()
                wait(1)
                back()
            }
        }
        , 
        {
            sequence(5) {
                grab()
                back()
                back()
                back()
                drop()
                back()
                wait(1)
                back()
                grab()
                back()
                back()
                back()
                drop()
                back()
                wait(1)
                back()
                grab()
                back()
                back()
                drop()
                back()
                back()
                wait(1)
                back()
                grab()
                back()
                back()
                back()
                drop()
                back()
                wait(1)
                back()
                grab()
                back()
                back()
                back()
                drop()
                back()
                wait(1)
                back()
                grab()
                back()
                back()
                back()
                drop()
                back()
                wait(1)
                back()
                grab()
                back()
                back()
                back()
                drop()
                back()
                wait(1)
                back()
                grab()
                back()
                back()
                wait(1)
                back()
                drop()
                back()
                back()
                grab()
                back()
                back()
                wait(1)
                back()
                drop()
                back()
            }
        }
        , 
        {
            sequence(7) {
                wait(2)
                back()
                back()
                grab()
                back()
                back()
                drop()
                back()
                back()
                wait(1)
                back()
                grab()
                back()
                back()
                back()
                drop()
                back()
                wait(1)
                back()
                grab()
                back()
                back()
                back()
                drop()
                back()
                wait(1)
                back()
                grab()
                back()
                back()
                drop()
                back()
                back()
                wait(1)
                back()
                grab()
                back()
                back()
                drop()
                back()
                back()
                wait(1)
                back()
                grab()
                back()
                back()
                drop()
                back()
                back()
                wait(1)
                back()
                grab()
                back()
                back()
                wait(1)
                back()
                drop()
                back()
                back()
                grab()
                back()
                back()
                drop()
                back()
                back()
                wait(1)
                back()
                grab()
                back()
                back()
            }
        }
        , 
        {
            sequence(8) {
                wait(2)
                back()
                back()
                wait(1)
                back()
                grab()
                back()
                back()
                drop()
                back()
                back()
                wait(1)
                back()
                grab()
                back()
                back()
                back()
                drop()
                back()
                wait(1)
                back()
                grab()
                back()
                back()
                drop()
                back()
                back()
                wait(1)
                back()
                grab()
                back()
                back()
                back()
                drop()
                back()
                wait(1)
                back()
                grab()
                back()
                back()
                drop()
                back()
                back()
                wait(1)
                back()
                grab()
                back()
                back()
                back()
                drop()
                back()
                wait(1)
                back()
                grab()
                back()
                back()
                wait(1)
                back()
                drop()
                back()
                back()
                grab()
                back()
                back()
                back()
                drop()
                back()
                wait(2)
                back()
            }
        }
        , 
        {
            sequence(18) {
                wait(14)
                grab()
                forward()
                drop()
            }
        }
        , 
        {
            sequence(28) {
                wait(7)
                grab()
                rotateClockwise()
                rotateClockwise()
                retract()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                extend()
                grab()
                rotateClockwise()
                pivotClockwise()
                pivotClockwise()
                retract()
                drop()
                rotateCounterClockwise()
                extend()
                wait(3)
                grab()
                rotateClockwise()
                pivotClockwise()
                pivotClockwise()
                retract()
                drop()
                rotateCounterClockwise()
                extend()
                wait(4)
                grab()
                rotateClockwise()
                pivotClockwise()
                pivotClockwise()
                retract()
                drop()
                rotateCounterClockwise()
                extend()
                wait(4)
                grab()
                rotateClockwise()
                pivotClockwise()
                pivotClockwise()
                retract()
                drop()
                rotateCounterClockwise()
                extend()
                wait(4)
                grab()
                rotateClockwise()
                pivotClockwise()
                pivotClockwise()
                retract()
                drop()
                wait(4)
                back()
            }
        }
        , 
        {
            sequence(2) {
                wait(3)
                forward()
                grab()
                forward()
                forward()
                drop()
                forward()
                forward()
                wait(1)
                reset()
                wait(3)
                forward()
                grab()
                forward()
                forward()
                wait(1)
                rotateCounterClockwise()
                pivotClockwise()
                drop()
                forward()
                forward()
                forward()
                wait(1)
                forward()
                grab()
                forward()
                wait(1)
                forward()
                rotateCounterClockwise()
                pivotClockwise()
                drop()
                forward()
                forward()
                forward()
                wait(1)
                forward()
                grab()
                forward()
                wait(1)
                forward()
                rotateCounterClockwise()
                pivotClockwise()
                drop()
                forward()
                forward()
                forward()
                wait(1)
                forward()
                grab()
                forward()
                wait(1)
                forward()
                drop()
                forward()
                forward()
                forward()
                wait(3)
                forward()
                grab()
                forward()
                wait(1)
                forward()
                drop()
                wait(1)
                forward()
                wait(1)
                forward()
            }
        }
        , 
        {
            sequence(17) {
                wait(2)
                grab()
                rotateClockwise()
                drop()
                wait(1)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
            }
        }
        , 
        {
            sequence(29) {
                wait(34)
                grab()
                rotateClockwise()
                forward()
                reset()
                wait(16)
                grab()
                rotateClockwise()
                forward()
                reset()
                wait(7)
                grab()
                rotateClockwise()
                forward()
                drop()
                back()
            }
        }
        , 
        {
            sequence(20) {
                wait(4)
                grab()
                rotateCounterClockwise()
                wait(1)
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(26) {
                wait(48)
                grab()
                rotateClockwise()
                wait(4)
                rotateCounterClockwise()
                wait(1)
                rotateClockwise()
                pivotCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(25) {
                wait(24)
                grab()
                rotateClockwise()
                wait(4)
                rotateCounterClockwise()
                drop()
                wait(4)
                repeat()
                wait(23)
                grab()
                rotateClockwise()
                wait(4)
                rotateCounterClockwise()
                wait(1)
                rotateClockwise()
                pivotCounterClockwise()
                wait(3)
                rotateClockwise()
            }
        }
        , 
        {
            sequence(10) {
                grab()
                back()
                drop()
            }
        }
        , 
        {
            sequence(12) {
                wait(8)
                grab()
                back()
                drop()
            }
        }
        , 
        {
            sequence(13) {
                wait(12)
                grab()
                back()
                drop()
            }
        }
        , 
        {
            sequence(14) {
                wait(16)
                grab()
                back()
                drop()
            }
        }
        , 
        {
            sequence(16) {
                wait(28)
                grab()
                extend()
                reset()
                wait(1)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                repeat()
                wait(3)
                grab()
                extend()
                drop()
            }
        }
        , 
        {
            sequence(15) {
                wait(20)
                grab()
                extend()
                drop()
            }
        }
        , 
        {
            sequence(11) {
                wait(4)
                grab()
                back()
                drop()
            }
        }
        , 
        {
            sequence(34) {
                wait(9)
                grab()
                back()
                drop()
            }
        }
        , 
        {
            sequence(33) {
                wait(20)
                back()
                grab()
                forward()
                reset()
                wait(8)
                repeat()
                wait(8)
                repeat()
                wait(15)
                back()
                grab()
                forward()
                drop()
                wait(7)
                grab()
                rotateClockwise()
                forward()
                drop()
            }
        }
        , 
        {
            sequence(31) {
                wait(17)
                grab()
                back()
                back()
                drop()
            }
        }
        , 
        {
            sequence(32) {
                wait(38)
                grab()
                back()
                back()
                drop()
            }
        }
        , 
        {
            sequence(27) {
                wait(7)
                back()
                grab()
                forward()
                forward()
                drop()
                wait(7)
                back()
                wait(2)
                grab()
                forward()
                drop()
                wait(6)
                back()
                wait(2)
                grab()
                forward()
                drop()
                wait(6)
                back()
                wait(2)
                grab()
                forward()
                drop()
                wait(6)
                back()
                wait(2)
                grab()
                forward()
                drop()
            }
        }
        , 
        {
            sequence(24) {
                wait(2)
                grab()
                back()
                wait(1)
                back()
                back()
                wait(2)
                pivotClockwise()
                rotateCounterClockwise()
                back()
                forward()
                pivotClockwise()
                pivotClockwise()
                wait(56)
                forward()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(21) {
                wait(5)
                grab()
                forward()
                forward()
                drop()
                back()
                wait(1)
                grab()
                forward()
                drop()
                back()
                wait(2)
                grab()
                forward()
                drop()
                back()
                wait(3)
                grab()
                forward()
                drop()
                back()
                grab()
                forward()
                drop()
                back()
                wait(3)
                grab()
                forward()
                drop()
                back()
                grab()
                forward()
                drop()
                back()
                wait(3)
                grab()
                forward()
                drop()
                back()
                grab()
                forward()
                drop()
                back()
                grab()
                forward()
                drop()
                back()
                grab()
                forward()
                drop()
                back()
                grab()
                forward()
                drop()
            }
        }
        , 
        {
            sequence(19) {
                wait(20)
                grab()
                extend()
                reset()
                wait(3)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                repeat()
                wait(5)
                grab()
                extend()
                drop()
            }
        }
        )
    }
}
