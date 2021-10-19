
solution {
    puzzle = "P099"
    name = "B X S F"
    arm(VAN_BERLOS_WHEEL) {
        number = 1
        position = 4 to -3
        rotation = 13
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = 0 to 2
        rotation = 15
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = -1 to 0
        rotation = 11
        size = 2
    }
    arm(ARM1) {
        number = 4
        position = 2 to 0
        rotation = 9
        size = 1
    }
    arm(ARM1) {
        number = 5
        position = 2 to 2
        rotation = 4
        size = 1
    }
    arm(ARM6) {
        number = 6
        position = 6 to -2
        rotation = 12
        size = 1
    }
    arm(ARM1) {
        number = 7
        position = 5 to 1
        rotation = 5
        size = 1
    }
    arm(ARM1) {
        number = 8
        position = 4 to 0
        rotation = 6
        size = 1
    }
    glyph(UNBONDER) {
        position = 0 to 1
        rotation = 17
    }
    glyph(UNBONDER) {
        position = 7 to -3
        rotation = 13
    }
    glyph(UNBONDER) {
        position = 5 to 0
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = 3 to -2
        rotation = 8
    }
    glyph(DUPLICATION) {
        position = 5 to -3
        rotation = 12
    }
    glyph(PROJECTION) {
        position = 4 to 1
        rotation = 8
    }
    glyph(PURIFICATION) {
        position = 1 to 2
        rotation = 16
    }
    glyph(UNIFICATION) {
        position = 4 to -1
        rotation = 13
    }
    glyph(EQUILIBRIUM) {
        position = 4 to -2
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 2 to 3
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 7 to -1
        rotation = 5
    }
    io(OUTPUT) {
        index = 1
        position = 3 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -1 to 2
        rotation = 14
    }
    io(INPUT) {
        index = 2
        position = 1 to -2
        rotation = 9
    }
    tape {
        parallel(
        {
            sequence(6) {
                wait(4)
                grab()
                pivotClockwise()
                rotateCounterClockwise()
                drop()
                wait(1)
                grab()
                rotateCounterClockwise()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(3) {
                wait(4)
                grab()
                pivotClockwise()
                rotateCounterClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(7) {
                wait(7)
                grab()
                rotateCounterClockwise()
                pivotClockwise()
                wait(3)
                rotateClockwise()
                wait(3)
                rotateClockwise()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(5) {
                wait(10)
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                wait(2)
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(4) {
                wait(4)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                wait(1)
                rotateCounterClockwise()
                reset()
                wait(3)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(8) {
                wait(12)
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                wait(9)
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
            }
        }
        )
    }
}
