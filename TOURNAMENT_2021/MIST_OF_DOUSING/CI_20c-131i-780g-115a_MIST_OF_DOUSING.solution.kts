
solution {
    puzzle = "w2450512021"
    name = "B CI131 6T"
    arm(VAN_BERLOS_WHEEL) {
        number = 1
        position = 6 to -3
        rotation = 1
        size = 1
    }
    arm(ARM6) {
        number = 2
        position = -2 to 5
        rotation = -2
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = -1 to 5
        rotation = -2
        size = 1
    }
    arm(ARM1) {
        number = 4
        position = 0 to 5
        rotation = -2
        size = 1
    }
    arm(ARM1) {
        number = 5
        position = 0 to 4
        rotation = -2
        size = 1
    }
    arm(ARM1) {
        number = 6
        position = -1 to 4
        rotation = -2
        size = 1
    }
    arm(PISTON) {
        number = 7
        position = 4 to -3
        rotation = 1
        size = 1
    }
    arm(PISTON) {
        number = 8
        position = 4 to -4
        rotation = 1
        size = 2
    }
    arm(ARM1) {
        number = 9
        position = 7 to -2
        rotation = 3
        size = 3
    }
    arm(ARM3) {
        number = 10
        position = 1 to -2
        rotation = 0
        size = 2
    }
    arm(PISTON) {
        number = 11
        position = -5 to 4
        rotation = 0
        size = 2
    }
    arm(ARM1) {
        number = 12
        position = -6 to 4
        rotation = 0
        size = 3
    }
    arm(ARM1) {
        number = 13
        position = 4 to -5
        rotation = 1
        size = 3
    }
    arm(ARM1) {
        number = 14
        position = -4 to 4
        rotation = -2
        size = 3
    }
    arm(ARM1) {
        number = 15
        position = -5 to 0
        rotation = 0
        size = 3
    }
    arm(PISTON) {
        number = 16
        position = 0 to -1
        rotation = -1
        size = 2
    }
    glyph(BONDER) {
        position = 2 to 0
        rotation = -1
    }
    glyph(BONDER) {
        position = -3 to 2
        rotation = 0
    }
    glyph(BONDER) {
        position = -6 to 2
        rotation = 1
    }
    glyph(BONDER) {
        position = -4 to 0
        rotation = -1
    }
    glyph(UNBONDER) {
        position = -5 to 3
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -4 to 1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 0 to 2
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = 1 to 0
        rotation = 1
    }
    glyph(DUPLICATION) {
        position = 2 to 1
        rotation = 2
    }
    glyph(DUPLICATION) {
        position = 5 to -2
        rotation = 8
    }
    glyph(DUPLICATION) {
        position = -2 to 3
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = -1 to 1
        rotation = 3
    }
    glyph(DUPLICATION) {
        position = -4 to 2
        rotation = 3
    }
    glyph(DUPLICATION) {
        position = -2 to -2
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = -1 to -3
        rotation = 3
    }
    io(OUTPUT) {
        index = 0
        position = 3 to 3
        rotation = -3
    }
    io(INPUT) {
        index = 0
        position = -3 to 4
        rotation = 1
    }
    io(INPUT) {
        index = 1
        position = 3 to -2
        rotation = -3
    }
    track {
        position = -2 to 5
        positions = listOf(0 to 0, 1 to -1, 2 to -1, 2 to 0, 1 to 0)
    }
    track {
        position = 1 to -2
        positions = listOf(0 to 0, 0 to 1, 1 to 1)
    }
    track {
        position = -5 to 4
        positions = listOf(1 to 0, 0 to 1, -1 to 1, 0 to 0, -1 to 0, -2 to 0)
    }
    track {
        position = 4 to -5
        positions = listOf(0 to 0, -1 to 0, -2 to 0, -3 to 0, -4 to 1)
    }
    track {
        position = -5 to 0
        positions = listOf(0 to 0, -1 to 1, -2 to 2)
    }
    track {
        position = 7 to -1
        positions = listOf(0 to 0, 0 to -1)
    }
    tape {
        parallel(
        {
            sequence(3) {
                wait(5)
                forward()
                grab()
                forward()
                rotateCounterClockwise()
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
            sequence(4) {
                wait(5)
                forward()
                wait(1)
                forward()
                grab()
                forward()
                rotateCounterClockwise()
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
            sequence(5) {
                wait(5)
                forward()
                wait(1)
                forward()
                wait(1)
                forward()
                grab()
                forward()
                rotateCounterClockwise()
                forward()
                pivotCounterClockwise()
                forward()
                drop()
                forward()
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
                rotateCounterClockwise()
                forward()
                pivotCounterClockwise()
                forward()
                drop()
            }
        }
        , 
        {
            sequence(1) {
        
            }
        }
        , 
        {
            sequence(15) {
                wait(2)
                grab()
                rotateClockwise()
                wait(2)
                forward()
                forward()
                wait(3)
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(12) {
                grab()
                rotateClockwise()
                drop()
                wait(1)
                forward()
            }
        }
        , 
        {
            sequence(2) {
                wait(4)
                grab()
                forward()
                rotateCounterClockwise()
                forward()
                pivotCounterClockwise()
                forward()
                drop()
                forward()
                wait(1)
                forward()
                grab()
                forward()
                rotateCounterClockwise()
                forward()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(13) {
                wait(2)
                grab()
                rotateCounterClockwise()
                forward()
                forward()
                forward()
                wait(3)
                forward()
                drop()
            }
        }
        , 
        {
            sequence(9) {
                wait(16)
                grab()
                back()
                drop()
            }
        }
        , 
        {
            sequence(7) {
                wait(6)
                grab()
                extend()
                reset()
                wait(1)
                grab()
                extend()
                drop()
            }
        }
        , 
        {
            sequence(10) {
                grab()
                forward()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                back()
                wait(2)
                grab()
                forward()
                drop()
                back()
                wait(2)
                grab()
                forward()
                drop()
            }
        }
        , 
        {
            sequence(16) {
                wait(6)
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                wait(1)
                rotateClockwise()
                extend()
                drop()
            }
        }
        , 
        {
            sequence(11) {
                wait(2)
                grab()
                rotateClockwise()
                forward()
                retract()
                drop()
                wait(5)
                grab()
                back()
                drop()
            }
        }
        , 
        {
            sequence(14) {
                wait(4)
                grab()
                forward()
                forward()
                back()
                forward()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(8) {
                wait(4)
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                wait(4)
                grab()
                extend()
                drop()
            }
        }
        )
    }
}
