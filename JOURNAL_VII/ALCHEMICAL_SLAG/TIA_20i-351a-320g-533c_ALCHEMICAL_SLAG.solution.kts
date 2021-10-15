
solution {
    puzzle = "P099"
    name = "NEW SOLUTION 2"
    arm(ARM6) {
        number = 1
        position = -2 to -1
        rotation = -2
        size = 1
    }
    arm(VAN_BERLOS_WHEEL) {
        number = 2
        position = 4 to -5
        rotation = -1
        size = 1
    }
    arm(ARM6) {
        number = 3
        position = 1 to -4
        rotation = 0
        size = 1
    }
    arm(ARM6) {
        number = 4
        position = 1 to -2
        rotation = 0
        size = 1
    }
    arm(ARM6) {
        number = 5
        position = 3 to -2
        rotation = 0
        size = 1
    }
    arm(ARM6) {
        number = 6
        position = -2 to 1
        rotation = 0
        size = 1
    }
    arm(ARM6) {
        number = 7
        position = 1 to 1
        rotation = 0
        size = 1
    }
    glyph(BONDER) {
        position = 0 to 4
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -1 to -2
        rotation = -1
    }
    glyph(UNBONDER) {
        position = -2 to 0
        rotation = -1
    }
    glyph(UNBONDER) {
        position = 0 to -4
        rotation = -1
    }
    glyph(UNBONDER) {
        position = 0 to 2
        rotation = 1
    }
    glyph(DUPLICATION) {
        position = 3 to -5
        rotation = 3
    }
    glyph(PROJECTION) {
        position = -1 to 1
        rotation = 0
    }
    glyph(UNIFICATION) {
        position = 2 to -3
        rotation = -1
    }
    io(INPUT) {
        index = 0
        position = -3 to -1
        rotation = 3
    }
    io(OUTPUT) {
        index = 0
        position = 1 to 0
        rotation = 0
    }
    io(OUTPUT) {
        index = 1
        position = 4 to -3
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = 3 to 1
        rotation = 1
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                drop()
                wait(3)
                extendTape()
            }
        }
        , 
        {
            sequence(3) {
                wait(2)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(4) {
                wait(7)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(5) {
                wait(5)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(2) {
                wait(2)
                rotateClockwise()
            }
        }
        , 
        {
            sequence(6) {
                wait(2)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(7) {
                grab()
                rotateCounterClockwise()
                pivotClockwise()
                drop()
            }
        }
        )
    }
}
