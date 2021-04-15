
solution {
    puzzle = "P054"
    name = "OVERLAP A"
    arm(VAN_BERLOS_WHEEL) {
        number = 1
        position = -5 to 0
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = -2 to -1
        rotation = 8
        size = 2
    }
    arm(VAN_BERLOS_WHEEL) {
        number = 3
        position = 1 to -2
        rotation = -1
        size = 1
    }
    arm(PISTON) {
        number = 4
        position = -4 to 2
        rotation = 5
        size = 1
    }
    arm(PISTON) {
        number = 5
        position = 0 to 1
        rotation = 3
        size = 1
    }
    arm(ARM1) {
        number = 6
        position = -1 to 3
        rotation = 4
        size = 1
    }
    arm(ARM1) {
        number = 7
        position = -4 to 4
        rotation = -1
        size = 1
    }
    glyph(BONDER) {
        position = -3 to 1
        rotation = 0
    }
    glyph(BONDER) {
        position = -2 to 1
        rotation = 0
    }
    glyph(BONDER) {
        position = -3 to 3
        rotation = 1
    }
    glyph(UNBONDER) {
        position = -3 to 4
        rotation = -1
    }
    glyph(UNBONDER) {
        position = -1 to 2
        rotation = 2
    }
    glyph(UNBONDER) {
        position = -2 to 3
        rotation = 1
    }
    glyph(UNBONDER) {
        position = -3 to 3
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -3 to 1
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = 0 to -1
        rotation = -4
    }
    glyph(DUPLICATION) {
        position = -4 to 1
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = -3 to 1
        rotation = 1
    }
    io(INPUT) {
        index = 0
        position = -1 to 1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -2 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -3 to 1
        rotation = 0
    }
    track {
        position = -5 to 0
        positions = listOf(0 to 0, 1 to 0)
    }
    track {
        position = -1 to 3
        positions = listOf(-3 to -1, -3 to 0, -3 to 1, -2 to 1)
    }
    tape {
        parallel(
        {
            sequence(5) {
                grab()
                extend()
                pivotClockwise()
                rotateClockwise()
                pivotClockwise()
                wait(1)
                rotateCounterClockwise()
                pivotClockwise()
                pivotClockwise()
                drop()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                pivotClockwise()
                pivotClockwise()
                drop()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                pivotClockwise()
                pivotClockwise()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                wait(4)
                rotateClockwise()
                rotateClockwise()
                wait(1)
                rotateCounterClockwise()
                rotateClockwise()
                wait(1)
                rotateCounterClockwise()
                rotateClockwise()
                wait(1)
                rotateCounterClockwise()
                rotateClockwise()
                wait(1)
                rotateCounterClockwise()
                rotateClockwise()
                wait(1)
                rotateCounterClockwise()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                wait(3)
                forward()
                wait(1)
                rotateClockwise()
                rotateCounterClockwise()
                wait(1)
                rotateClockwise()
                rotateCounterClockwise()
                wait(1)
                rotateClockwise()
                rotateCounterClockwise()
                wait(1)
                rotateClockwise()
                rotateCounterClockwise()
                wait(1)
                rotateClockwise()
                rotateCounterClockwise()
                wait(1)
                rotateClockwise()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(6) {
                wait(5)
                grab()
                rotateClockwise()
                drop()
                rotateClockwise()
                wait(5)
                grab()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(7) {
                wait(5)
                grab()
                rotateClockwise()
                rotateCounterClockwise()
                wait(1)
                pivotClockwise()
                wait(1)
                rotateCounterClockwise()
                rotateClockwise()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(4) {
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                extend()
                wait(1)
                forward()
                grab()
                rotateClockwise()
                pivotClockwise()
                pivotClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                pivotClockwise()
                pivotClockwise()
                drop()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                wait(2)
                grab()
                rotateClockwise()
                pivotClockwise()
                pivotClockwise()
                reset()
            }
        }
        )
    }
}
