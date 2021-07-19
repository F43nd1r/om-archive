
solution {
    puzzle = "w2450512021"
    name = "B CA BIGGIEMAC42"
    arm(VAN_BERLOS_WHEEL) {
        number = 1
        position = 3 to 1
        rotation = 1
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = -6 to 8
        rotation = -1
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = -6 to 9
        rotation = -1
        size = 1
    }
    arm(ARM1) {
        number = 4
        position = -5 to 9
        rotation = -1
        size = 1
    }
    arm(ARM1) {
        number = 5
        position = -4 to 9
        rotation = -1
        size = 1
    }
    arm(ARM1) {
        number = 6
        position = -3 to 9
        rotation = -1
        size = 1
    }
    arm(ARM1) {
        number = 7
        position = -3 to 8
        rotation = -1
        size = 1
    }
    arm(ARM1) {
        number = 8
        position = 4 to 2
        rotation = 3
        size = 3
    }
    arm(ARM1) {
        number = 9
        position = -8 to 7
        rotation = 0
        size = 3
    }
    arm(ARM1) {
        number = 10
        position = -8 to 6
        rotation = 0
        size = 3
    }
    arm(ARM1) {
        number = 11
        position = -9 to 6
        rotation = -1
        size = 3
    }
    arm(PISTON) {
        number = 12
        position = 0 to 1
        rotation = 1
        size = 1
    }
    arm(PISTON) {
        number = 13
        position = 1 to 0
        rotation = 1
        size = 2
    }
    arm(ARM1) {
        number = 14
        position = 1 to -1
        rotation = 1
        size = 3
    }
    arm(ARM1) {
        number = 15
        position = -4 to 1
        rotation = 1
        size = 3
    }
    arm(ARM1) {
        number = 16
        position = -4 to 0
        rotation = 1
        size = 3
    }
    arm(ARM1) {
        number = 17
        position = -6 to 3
        rotation = 2
        size = 1
    }
    arm(ARM1) {
        number = 18
        position = -4 to -1
        rotation = 1
        size = 3
    }
    arm(PISTON) {
        number = 19
        position = 1 to 1
        rotation = 1
        size = 1
    }
    glyph(BONDER) {
        position = -1 to 4
        rotation = -1
    }
    glyph(BONDER) {
        position = -3 to 4
        rotation = 1
    }
    glyph(BONDER) {
        position = -5 to 4
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -4 to 2
        rotation = 1
    }
    glyph(UNBONDER) {
        position = -7 to 4
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -3 to 6
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = -4 to 6
        rotation = 1
    }
    glyph(DUPLICATION) {
        position = -2 to 4
        rotation = 1
    }
    glyph(DUPLICATION) {
        position = -1 to 5
        rotation = 2
    }
    glyph(DUPLICATION) {
        position = 2 to 2
        rotation = 8
    }
    glyph(DUPLICATION) {
        position = -2 to 3
        rotation = 3
    }
    glyph(DUPLICATION) {
        position = -6 to 6
        rotation = 1
    }
    glyph(DUPLICATION) {
        position = -5 to 3
        rotation = -2
    }
    glyph(DUPLICATION) {
        position = -2 to 1
        rotation = 1
    }
    glyph(DUPLICATION) {
        position = -7 to 5
        rotation = -3
    }
    io(INPUT) {
        index = 0
        position = -5 to 6
        rotation = 2
    }
    io(OUTPUT) {
        index = 0
        position = 0 to 7
        rotation = -3
    }
    io(INPUT) {
        index = 1
        position = 0 to 2
        rotation = -3
    }
    track {
        position = 4 to 2
        positions = listOf(0 to 0, 0 to 1)
    }
    track {
        position = -7 to 6
        positions = listOf(-2 to 1, -1 to 1, 0 to 1, 0 to 0, -1 to 0, -2 to 0)
    }
    track {
        position = -3 to -2
        positions = listOf(-1 to 1, -1 to 2, -1 to 3, -2 to 3, -2 to 2, -2 to 1)
    }
    track {
        position = 1 to -1
        positions = listOf(0 to 1, 0 to 0, -1 to 0, -2 to 1, -2 to 2, -1 to 2)
    }
    track {
        position = -6 to 8
        positions = listOf(0 to 0, 1 to 0, 2 to 0, 3 to 0, 3 to 1, 2 to 1, 1 to 1, 0 to 1)
    }
    tape {
        parallel(
        {
            sequence(8) {
                wait(8)
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
            }
        }
        , 
        {
            sequence(1) {
        
            }
        }
        , 
        {
            sequence(12) {
                grab()
                extend()
                rotateCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                extend()
                drop()
                wait(1)
                forward()
                wait(1)
                forward()
                retract()
                retract()
                rotateClockwise()
                forward()
                forward()
                forward()
                forward()
            }
        }
        , 
        {
            sequence(9) {
                wait(2)
                grab()
                back()
                pivotClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                wait(1)
                forward()
                drop()
                forward()
                forward()
                rotateCounterClockwise()
                forward()
                forward()
                forward()
                forward()
            }
        }
        , 
        {
            sequence(2) {
                wait(4)
                grab()
                forward()
                forward()
                forward()
                pivotCounterClockwise()
                forward()
                drop()
                forward()
                wait(1)
                forward()
                wait(1)
                forward()
                wait(1)
                forward()
            }
        }
        , 
        {
            sequence(13) {
                wait(2)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                wait(1)
                rotateClockwise()
                extend()
                forward()
                forward()
                forward()
                wait(1)
                forward()
                forward()
                drop()
                retract()
                rotateClockwise()
                forward()
            }
        }
        , 
        {
            sequence(14) {
                wait(4)
                grab()
                rotateCounterClockwise()
                forward()
                forward()
                forward()
                forward()
                drop()
                wait(2)
                forward()
                rotateClockwise()
                forward()
            }
        }
        , 
        {
            sequence(10) {
                grab()
                rotateClockwise()
                back()
                forward()
                wait(2)
                back()
                back()
                drop()
                forward()
                forward()
                forward()
                forward()
                grab()
                forward()
                forward()
                drop()
                rotateCounterClockwise()
                forward()
                forward()
            }
        }
        , 
        {
            sequence(17) {
                wait(7)
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
            }
        }
        , 
        {
            sequence(11) {
                wait(8)
                forward()
                grab()
                forward()
                forward()
                drop()
                forward()
                forward()
                forward()
            }
        }
        , 
        {
            sequence(18) {
                wait(3)
                grab()
                back()
                wait(1)
                back()
                wait(5)
                back()
                drop()
                forward()
                forward()
                forward()
            }
        }
        , 
        {
            sequence(16) {
                wait(4)
                back()
                wait(1)
                back()
                wait(4)
                forward()
                grab()
                forward()
                forward()
                drop()
                back()
            }
        }
        , 
        {
            sequence(7) {
                wait(5)
                forward()
                wait(1)
                forward()
                wait(1)
                forward()
                wait(1)
                forward()
                wait(1)
                forward()
                grab()
                forward()
                forward()
                forward()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
            }
        }
        , 
        {
            sequence(6) {
                wait(5)
                forward()
                wait(1)
                forward()
                wait(1)
                forward()
                wait(1)
                forward()
                grab()
                forward()
                forward()
                forward()
                pivotCounterClockwise()
                forward()
                drop()
            }
        }
        , 
        {
            sequence(5) {
                wait(5)
                forward()
                wait(1)
                forward()
                wait(1)
                forward()
                grab()
                forward()
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
            sequence(4) {
                wait(5)
                forward()
                wait(1)
                forward()
                grab()
                forward()
                forward()
                forward()
                pivotCounterClockwise()
                forward()
                drop()
                forward()
                wait(1)
                forward()
            }
        }
        , 
        {
            sequence(3) {
                wait(5)
                forward()
                grab()
                forward()
                forward()
                forward()
                pivotCounterClockwise()
                forward()
                drop()
                forward()
                wait(1)
                forward()
                wait(1)
                forward()
            }
        }
        , 
        {
            sequence(19) {
                wait(6)
                grab()
                extend()
                drop()
                retract()
                grab()
                extend()
                drop()
                retract()
                grab()
                extend()
                drop()
                retract()
            }
        }
        , 
        {
            sequence(15) {
                wait(4)
                back()
                wait(1)
                back()
                wait(1)
                grab()
                forward()
                forward()
                drop()
                wait(2)
                forward()
                wait(1)
                back()
            }
        }
        )
    }
}
