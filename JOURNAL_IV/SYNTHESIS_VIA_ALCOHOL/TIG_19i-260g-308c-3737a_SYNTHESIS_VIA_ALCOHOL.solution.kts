
solution {
    puzzle = "P071"
    name = "NO-TRACK"
    arm(ARM6) {
        number = 1
        position = 0 to 0
        rotation = -1
        size = 2
    }
    arm(VAN_BERLOS_WHEEL) {
        number = 2
        position = 0 to 2
        rotation = -3
        size = 1
    }
    arm(ARM6) {
        number = 3
        position = 3 to 0
        rotation = 0
        size = 1
    }
    arm(ARM6) {
        number = 4
        position = 5 to 0
        rotation = 0
        size = 1
    }
    arm(ARM6) {
        number = 5
        position = 5 to 2
        rotation = -8
        size = 1
    }
    arm(PISTON) {
        number = 6
        position = 6 to 1
        rotation = -4
        size = 2
    }
    glyph(BONDER) {
        position = 1 to -3
        rotation = -3
    }
    glyph(BONDER) {
        position = 4 to 3
        rotation = 2
    }
    glyph(UNBONDER) {
        position = 2 to -2
        rotation = -2
    }
    glyph(DUPLICATION) {
        position = 1 to 1
        rotation = -6
    }
    glyph(UNIFICATION) {
        position = 4 to 1
        rotation = -4
    }
    io(INPUT) {
        index = 0
        position = -3 to 0
        rotation = -5
    }
    io(OUTPUT) {
        index = 0
        position = 5 to -1
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                pivotClockwise()
                drop()
                wait(3)
                extendTape()
            }
        }
        , 
        {
            sequence(3) {
                wait(3)
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(4) {
                wait(8)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(2) {
                wait(4)
                rotateCounterClockwise()
            }
        }
        , 
        {
            sequence(5) {
                wait(6)
                grab()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(6) {
                wait(8)
                grab()
                extend()
                reset()
            }
        }
        )
    }
}
