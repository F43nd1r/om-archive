
solution {
    puzzle = "P099"
    name = "NEW SOLUTION 2"
    arm(ARM6) {
        number = 1
        position = -3 to -1
        rotation = 0
        size = 1
    }
    arm(ARM6) {
        number = 2
        position = -2 to -5
        rotation = 1
        size = 1
    }
    arm(ARM6) {
        number = 3
        position = -2 to -3
        rotation = 1
        size = 1
    }
    arm(ARM6) {
        number = 4
        position = -4 to -3
        rotation = 1
        size = 1
    }
    arm(VAN_BERLOS_WHEEL) {
        number = 5
        position = -7 to -1
        rotation = 0
        size = 1
    }
    arm(ARM6) {
        number = 6
        position = -9 to 0
        rotation = 0
        size = 1
    }
    arm(ARM6) {
        number = 7
        position = -9 to -2
        rotation = 0
        size = 1
    }
    arm(ARM6) {
        number = 8
        position = -11 to -2
        rotation = 0
        size = 1
    }
    arm(PISTON) {
        number = 9
        position = -10 to -3
        rotation = -3
        size = 1
    }
    glyph(BONDER) {
        position = -4 to 2
        rotation = 0
    }
    glyph(BONDER) {
        position = -11 to -3
        rotation = -3
    }
    glyph(UNBONDER) {
        position = -9 to 1
        rotation = 1
    }
    glyph(UNBONDER) {
        position = -4 to 0
        rotation = 1
    }
    glyph(DUPLICATION) {
        position = -7 to 0
        rotation = 1
    }
    glyph(PURIFICATION) {
        position = -3 to -2
        rotation = 2
    }
    glyph(PURIFICATION) {
        position = -1 to -5
        rotation = 1
    }
    glyph(PURIFICATION) {
        position = -3 to -4
        rotation = -3
    }
    glyph(UNIFICATION) {
        position = -10 to -1
        rotation = -1
    }
    io(OUTPUT) {
        index = 0
        position = -3 to -3
        rotation = 0
    }
    io(OUTPUT) {
        index = 1
        position = -8 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = -1 to -1
        rotation = 1
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                pivotClockwise()
                drop()
                wait(5)
                extendTape()
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
            sequence(2) {
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(3) {
                wait(4)
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(5) {
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
            sequence(8) {
                wait(5)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(7) {
                wait(7)
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(9) {
                wait(10)
                grab()
                extend()
                reset()
            }
        }
        )
    }
}
