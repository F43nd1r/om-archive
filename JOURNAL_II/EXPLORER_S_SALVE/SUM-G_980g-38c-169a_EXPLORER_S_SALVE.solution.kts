
solution {
    puzzle = "P059"
    name = "B CA 6T"
    arm(VAN_BERLOS_WHEEL) {
        number = 1
        position = -14 to 1
        rotation = 1
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = -20 to 4
        rotation = 1
        size = 3
    }
    arm(ARM1) {
        number = 3
        position = -20 to 6
        rotation = 2
        size = 1
    }
    arm(ARM1) {
        number = 4
        position = -19 to 5
        rotation = 2
        size = 1
    }
    arm(PISTON) {
        number = 5
        position = -18 to 9
        rotation = -2
        size = 3
    }
    arm(ARM1) {
        number = 6
        position = -17 to 3
        rotation = 1
        size = 1
    }
    arm(ARM1) {
        number = 7
        position = -18 to 3
        rotation = 1
        size = 1
    }
    arm(ARM1) {
        number = 8
        position = -10 to 7
        rotation = 4
        size = 1
    }
    arm(ARM1) {
        number = 9
        position = -10 to 1
        rotation = 4
        size = 2
    }
    arm(ARM1) {
        number = 10
        position = -10 to 2
        rotation = 4
        size = 2
    }
    arm(ARM1) {
        number = 11
        position = -11 to 2
        rotation = 2
        size = 2
    }
    arm(ARM1) {
        number = 12
        position = -7 to 0
        rotation = 1
        size = 2
    }
    arm(ARM1) {
        number = 13
        position = -6 to -1
        rotation = 1
        size = 2
    }
    arm(ARM1) {
        number = 14
        position = 3 to -1
        rotation = 3
        size = 1
    }
    arm(ARM1) {
        number = 15
        position = 3 to 0
        rotation = 3
        size = 1
    }
    arm(ARM1) {
        number = 16
        position = 4 to -3
        rotation = 2
        size = 2
    }
    arm(PISTON) {
        number = 17
        position = 3 to -2
        rotation = 2
        size = 1
    }
    arm(ARM1) {
        number = 18
        position = -2 to -4
        rotation = 0
        size = 1
    }
    arm(PISTON) {
        number = 19
        position = 0 to -5
        rotation = 1
        size = 2
    }
    arm(PISTON) {
        number = 20
        position = 2 to -5
        rotation = 1
        size = 2
    }
    arm(PISTON) {
        number = 21
        position = 2 to -4
        rotation = 1
        size = 3
    }
    glyph(BONDER) {
        position = -14 to 3
        rotation = 1
    }
    glyph(BONDER) {
        position = 1 to -1
        rotation = 1
    }
    glyph(BONDER) {
        position = 0 to -3
        rotation = 0
    }
    glyph(BONDER) {
        position = -3 to -2
        rotation = 5
    }
    glyph(MULTI_BONDER) {
        position = -18 to 7
        rotation = 1
    }
    glyph(UNBONDER) {
        position = -18 to 6
        rotation = -1
    }
    glyph(UNBONDER) {
        position = -4 to 1
        rotation = 4
    }
    glyph(CALCIFICATION) {
        position = -8 to 4
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -5 to 1
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = -12 to 6
        rotation = 1
    }
    glyph(DUPLICATION) {
        position = -14 to 6
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = -13 to 5
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = -12 to 4
        rotation = 5
    }
    glyph(DUPLICATION) {
        position = -15 to 2
        rotation = 1
    }
    glyph(DUPLICATION) {
        position = -11 to 5
        rotation = 1
    }
    glyph(DUPLICATION) {
        position = -9 to 3
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = -7 to 3
        rotation = 5
    }
    glyph(DUPLICATION) {
        position = -9 to 5
        rotation = 1
    }
    glyph(DUPLICATION) {
        position = -3 to 0
        rotation = 4
    }
    glyph(DUPLICATION) {
        position = -13 to 2
        rotation = 7
    }
    glyph(DUPLICATION) {
        position = -13 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -21 to 8
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -1 to 2
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -11 to 0
        rotation = -1
    }
    io(INPUT) {
        index = 2
        position = 2 to -1
        rotation = 0
    }
    track {
        position = -18 to 4
        positions = listOf(0 to 0, 0 to -1, 1 to -1)
    }
    track {
        position = -20 to 6
        positions = listOf(0 to 0, 1 to 0, 1 to -1)
    }
    track {
        position = 3 to -2
        positions = listOf(0 to 0, 0 to -1, 1 to -1)
    }
    track {
        position = -7 to 0
        positions = listOf(0 to 0, 0 to -1, 1 to -1)
    }
    track {
        position = 3 to -1
        positions = listOf(0 to 0, -1 to 1, 0 to 1)
    }
    track {
        position = -11 to 2
        positions = listOf(0 to 0, 1 to 0, 1 to -1)
    }
    track {
        position = 1 to -4
        positions = listOf(0 to 0, 1 to -1)
    }
    tape {
        parallel(
        {
            sequence(3) {
                wait(2)
                forward()
                grab()
                rotateClockwise()
                drop()
                forward()
                rotateCounterClockwise()
                forward()
                wait(1)
                repeat()
                wait(7)
                repeat()
            }
        }
        , 
        {
            sequence(6) {
                wait(3)
                grab()
                forward()
                rotateClockwise()
                drop()
                forward()
                rotateCounterClockwise()
                forward()
                wait(1)
                repeat()
                wait(7)
                repeat()
            }
        }
        , 
        {
            sequence(8) {
                wait(8)
                grab()
                rotateCounterClockwise()
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
            }
        }
        , 
        {
            sequence(12) {
                wait(10)
                grab()
                forward()
                rotateClockwise()
                pivotClockwise()
                drop()
                forward()
                rotateCounterClockwise()
                forward()
                repeat()
                wait(7)
                repeat()
            }
        }
        , 
        {
            sequence(4) {
                wait(4)
                forward()
                wait(1)
                forward()
                grab()
                rotateClockwise()
                drop()
                forward()
                rotateCounterClockwise()
                repeat()
                wait(7)
                repeat()
            }
        }
        , 
        {
            sequence(7) {
                wait(5)
                forward()
                wait(1)
                grab()
                forward()
                rotateClockwise()
                drop()
                forward()
                rotateCounterClockwise()
                repeat()
                wait(7)
                repeat()
            }
        }
        , 
        {
            sequence(13) {
                wait(13)
                forward()
                grab()
                forward()
                rotateClockwise()
                pivotClockwise()
                drop()
                forward()
                rotateCounterClockwise()
                repeat()
                wait(7)
                repeat()
            }
        }
        , 
        {
            sequence(2) {
                wait(1)
                grab()
                rotateClockwise()
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
            }
        }
        , 
        {
            sequence(20) {
                wait(2)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                grab()
                rotateCounterClockwise()
                retract()
                rotateCounterClockwise()
                wait(9)
                back()
                extend()
                drop()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                wait(39)
                rotateClockwise()
                rotateCounterClockwise()
            }
        }
        , 
        {
            sequence(10) {
                wait(3)
                forward()
                wait(1)
                grab()
                rotateClockwise()
                forward()
                pivotCounterClockwise()
                wait(1)
                rotateClockwise()
                forward()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                repeat()
                wait(11)
                forward()
                wait(10)
                grab()
                rotateCounterClockwise()
                back()
                reset()
            }
        }
        , 
        {
            sequence(11) {
                wait(3)
                forward()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                wait(1)
                grab()
                rotateClockwise()
                forward()
                pivotCounterClockwise()
                wait(1)
                rotateClockwise()
                repeat()
                wait(11)
                forward()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                wait(9)
                back()
                reset()
            }
        }
        , 
        {
            sequence(9) {
                wait(1)
                grab()
                rotateClockwise()
                forward()
                pivotCounterClockwise()
                wait(1)
                rotateClockwise()
                forward()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                wait(1)
                repeat()
                wait(11)
                grab()
                rotateClockwise()
                forward()
                pivotCounterClockwise()
                rotateClockwise()
                pivotClockwise()
                wait(7)
                rotateCounterClockwise()
                rotateCounterClockwise()
                back()
                reset()
            }
        }
        , 
        {
            sequence(21) {
                wait(2)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
                wait(4)
                grab()
                retract()
                rotateCounterClockwise()
                retract()
                rotateCounterClockwise()
                wait(1)
                extend()
                drop()
                retract()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                wait(1)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                extend()
                reset()
            }
        }
        , 
        {
            sequence(15) {
                wait(17)
                forward()
                grab()
                forward()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                forward()
                wait(1)
                repeat()
                wait(7)
                repeat()
            }
        }
        , 
        {
            sequence(14) {
                wait(14)
                grab()
                forward()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                forward()
                wait(1)
                forward()
                repeat()
                wait(7)
                repeat()
            }
        }
        , 
        {
            sequence(17) {
                wait(6)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                extend()
                drop()
                rotateClockwise()
                rotateClockwise()
                wait(2)
                back()
                grab()
                rotateCounterClockwise()
                back()
                pivotClockwise()
                drop()
                back()
                rotateClockwise()
                back()
                grab()
                rotateCounterClockwise()
                back()
                pivotClockwise()
                drop()
                back()
                rotateClockwise()
                back()
                grab()
                rotateCounterClockwise()
                back()
                pivotClockwise()
                reset()
            }
        }
        , 
        {
            sequence(18) {
                wait(5)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                rotateCounterClockwise()
                wait(3)
                grab()
                pivotClockwise()
                reset()
                wait(1)
                rotateClockwise()
                wait(1)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                pivotClockwise()
                reset()
                wait(1)
                grab()
                rotateClockwise()
                wait(1)
                rotateCounterClockwise()
                rotateCounterClockwise()
                pivotClockwise()
                reset()
            }
        }
        , 
        {
            sequence(19) {
                wait(4)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                grab()
                retract()
                wait(6)
                rotateCounterClockwise()
                extend()
                pivotClockwise()
                reset()
                wait(1)
                retract()
                grab()
                rotateCounterClockwise()
                extend()
                wait(1)
                pivotClockwise()
                reset()
                wait(1)
                retract()
                wait(1)
                grab()
                rotateCounterClockwise()
                extend()
                pivotClockwise()
                reset()
            }
        }
        , 
        {
            sequence(16) {
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                repeat()
                wait(3)
                repeat()
                wait(3)
                grab()
                rotateCounterClockwise()
                back()
                pivotClockwise()
                drop()
                back()
                rotateClockwise()
                back()
                repeat()
                wait(7)
                repeat()
            }
        }
        , 
        {
            sequence(5) {
                wait(3)
                grab()
                retract()
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
            }
        }
        )
    }
}
