
solution {
    puzzle = "P054"
    name = "OVERLAP A"
    arm(ARM1) {
        number = 1
        position = 1 to -4
        rotation = 8
        size = 2
    }
    arm(VAN_BERLOS_WHEEL) {
        number = 2
        position = -2 to -3
        rotation = 0
        size = 1
    }
    arm(VAN_BERLOS_WHEEL) {
        number = 3
        position = 4 to -5
        rotation = -1
        size = 1
    }
    arm(ARM1) {
        number = 4
        position = -1 to -1
        rotation = 0
        size = 2
    }
    arm(PISTON) {
        number = 5
        position = 3 to -2
        rotation = 3
        size = 1
    }
    arm(ARM1) {
        number = 6
        position = 2 to 0
        rotation = 4
        size = 1
    }
    arm(PISTON) {
        number = 7
        position = 0 to 1
        rotation = -2
        size = 3
    }
    glyph(BONDER) {
        position = 3 to -1
        rotation = 3
    }
    glyph(BONDER) {
        position = 0 to -2
        rotation = 0
    }
    glyph(BONDER) {
        position = 1 to -2
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 0 to 1
        rotation = -1
    }
    glyph(UNBONDER) {
        position = 2 to -1
        rotation = 2
    }
    glyph(UNBONDER) {
        position = 1 to 0
        rotation = 1
    }
    glyph(CALCIFICATION) {
        position = 0 to -2
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = 3 to -4
        rotation = -4
    }
    glyph(DUPLICATION) {
        position = -1 to -2
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = 0 to -2
        rotation = 1
    }
    io(INPUT) {
        index = 0
        position = 2 to -2
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 1 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 0 to -2
        rotation = 0
    }
    track {
        position = 2 to 0
        positions = listOf(-3 to -1, -3 to 0, -3 to 1, -2 to 1)
    }
    track {
        position = -2 to -3
        positions = listOf(0 to 0, 1 to 0)
    }
    tape {
        parallel(
        {
            sequence(1) {
                wait(2)
                grab()
                rotateClockwise()
                pivotClockwise()
                pivotClockwise()
                reset()
            }
        }
        , 
        {
            sequence(7) {
                grab()
                back()
                drop()
                retract()
                rotateCounterClockwise()
                rotateCounterClockwise()
                retract()
                grab()
                rotateClockwise()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(5) {
                grab()
                extend()
                pivotClockwise()
                rotateClockwise()
                wait(1)
                pivotCounterClockwise()
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
            sequence(6) {
                wait(4)
                grab()
                rotateCounterClockwise()
                rotateClockwise()
                rotateCounterClockwise()
                wait(1)
                rotateClockwise()
                wait(2)
                rotateClockwise()
                drop()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(4) {
                wait(7)
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
            sequence(2) {
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
                back()
            }
        }
        )
    }
}
