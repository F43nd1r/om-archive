
solution {
    puzzle = "P099"
    name = "NEW SOLUTION 6"
    arm(ARM6) {
        number = 1
        position = 2 to -1
        rotation = -1
        size = 1
    }
    arm(ARM2) {
        number = 2
        position = 5 to -2
        rotation = 4
        size = 1
    }
    arm(ARM6) {
        number = 3
        position = 4 to 0
        rotation = 0
        size = 1
    }
    arm(VAN_BERLOS_WHEEL) {
        number = 4
        position = 2 to 3
        rotation = 1
        size = 1
    }
    arm(ARM6) {
        number = 5
        position = 6 to 0
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 6
        position = 4 to 2
        rotation = -5
        size = 1
    }
    arm(ARM2) {
        number = 7
        position = 0 to 2
        rotation = 0
        size = 1
    }
    arm(ARM6) {
        number = 8
        position = -2 to 1
        rotation = 0
        size = 1
    }
    arm(ARM6) {
        number = 9
        position = 0 to -2
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 10
        position = -2 to -1
        rotation = 1
        size = 1
    }
    glyph(UNBONDER) {
        position = 3 to -1
        rotation = 1
    }
    glyph(DUPLICATION) {
        position = 2 to 2
        rotation = 5
    }
    glyph(PURIFICATION) {
        position = 1 to 0
        rotation = 6
    }
    glyph(PURIFICATION) {
        position = 0 to 1
        rotation = 8
    }
    glyph(PURIFICATION) {
        position = -2 to 0
        rotation = 5
    }
    glyph(UNIFICATION) {
        position = 5 to 1
        rotation = -1
    }
    io(OUTPUT) {
        index = 0
        position = -1 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 3 to -2
        rotation = -2
    }
    io(OUTPUT) {
        index = 1
        position = 7 to 0
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(3) {
                wait(2)
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(4) {
                wait(3)
                rotateCounterClockwise()
            }
        }
        , 
        {
            sequence(5) {
                wait(5)
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(6) {
                wait(7)
                grab()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(7) {
                wait(3)
                grab()
                rotateClockwise()
                drop()
                rotateClockwise()
            }
        }
        , 
        {
            sequence(8) {
                wait(6)
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(9) {
                wait(6)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(10) {
                wait(9)
                grab()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                wait(3)
                grab()
                pivotCounterClockwise()
                pivotClockwise()
                drop()
                rotateClockwise()
            }
        }
        )
    }
}
