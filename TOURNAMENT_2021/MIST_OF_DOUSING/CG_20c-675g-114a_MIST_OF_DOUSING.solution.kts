
solution {
    puzzle = "w2450512021"
    name = "B CG BIGGIEMAC42"
    arm(VAN_BERLOS_WHEEL) {
        number = 1
        position = 6 to -3
        rotation = 1
        size = 1
    }
    arm(ARM1) {
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
    arm(ARM1) {
        number = 7
        position = 4 to -4
        rotation = 1
        size = 3
    }
    arm(ARM1) {
        number = 8
        position = 1 to -2
        rotation = 0
        size = 2
    }
    arm(ARM1) {
        number = 9
        position = -5 to 4
        rotation = 0
        size = 2
    }
    arm(ARM1) {
        number = 10
        position = -6 to 4
        rotation = 0
        size = 3
    }
    arm(ARM1) {
        number = 11
        position = 4 to -5
        rotation = 1
        size = 3
    }
    arm(ARM1) {
        number = 12
        position = 5 to -4
        rotation = 2
        size = 2
    }
    arm(ARM1) {
        number = 13
        position = -4 to 4
        rotation = -2
        size = 3
    }
    arm(ARM1) {
        number = 14
        position = -5 to 0
        rotation = 0
        size = 3
    }
    arm(PISTON) {
        number = 15
        position = 0 to -1
        rotation = -1
        size = 3
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
        positions = listOf(0 to 0, 0 to 1)
    }
    track {
        position = -5 to 4
        positions = listOf(1 to 0, 0 to 1, -1 to 1, 0 to 0, -1 to 0, -2 to 1, -2 to 0)
    }
    track {
        position = 4 to -5
        positions = listOf(0 to 1, 0 to 0, -1 to 0, -2 to 0, -3 to 0, -4 to 1)
    }
    track {
        position = -5 to 0
        positions = listOf(0 to 0, -1 to 1, -2 to 2)
    }
    tape {
        parallel(
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
                rotateClockwise()
                forward()
                grab()
                forward()
                rotateCounterClockwise()
                forward()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
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
                rotateClockwise()
                forward()
                wait(1)
                forward()
                wait(4)
                reset()
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
                wait(1)
                rotateClockwise()
                wait(2)
                reset()
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
                wait(1)
                rotateClockwise()
                wait(2)
                reset()
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
                rotateClockwise()
                wait(2)
                reset()
            }
        }
        , 
        {
            sequence(1) {
        
            }
        }
        , 
        {
            sequence(8) {
                grab()
                forward()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
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
                reset()
            }
        }
        , 
        {
            sequence(14) {
                wait(2)
                grab()
                rotateClockwise()
                wait(2)
                forward()
                forward()
                wait(3)
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(10) {
                grab()
                rotateClockwise()
                drop()
                wait(1)
                forward()
                forward()
                wait(7)
                forward()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(11) {
                wait(2)
                grab()
                rotateCounterClockwise()
                forward()
                forward()
                forward()
                rotateCounterClockwise()
                wait(1)
                rotateClockwise()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(12) {
                wait(4)
                grab()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(7) {
                wait(5)
                forward()
                grab()
                back()
                drop()
                forward()
                grab()
                back()
                drop()
                forward()
                grab()
                back()
                reset()
            }
        }
        , 
        {
            sequence(15) {
                wait(6)
                grab()
                retract()
                rotateClockwise()
                rotateClockwise()
                retract()
                pivotClockwise()
                pivotClockwise()
                extend()
                rotateClockwise()
                extend()
                reset()
            }
        }
        , 
        {
            sequence(9) {
                wait(2)
                grab()
                rotateClockwise()
                forward()
                forward()
                drop()
                wait(4)
                back()
                grab()
                back()
                reset()
            }
        }
        , 
        {
            sequence(13) {
                wait(4)
                grab()
                forward()
                forward()
                back()
                forward()
                rotateCounterClockwise()
                reset()
            }
        }
        )
    }
}
