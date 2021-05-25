
solution {
    puzzle = "P096"
    name = "TIC"
    arm(ARM6) {
        number = 1
        position = -1 to -1
        rotation = 0
        size = 3
    }
    arm(ARM1) {
        number = 2
        position = -2 to 0
        rotation = 2
        size = 2
    }
    arm(ARM6) {
        number = 3
        position = 4 to -1
        rotation = 0
        size = 1
    }
    arm(PISTON) {
        number = 4
        position = 5 to 1
        rotation = -2
        size = 2
    }
    arm(ARM6) {
        number = 5
        position = 8 to -4
        rotation = 0
        size = 2
    }
    glyph(BONDER) {
        position = 5 to -2
        rotation = 1
    }
    glyph(UNBONDER) {
        position = 2 to -1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 8 to -1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 8 to -2
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 9 to -6
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = 0 to -5
        rotation = 1
    }
    glyph(DUPLICATION) {
        position = 9 to -5
        rotation = 5
    }
    io(OUTPUT) {
        index = 0
        position = 2 to -4
        rotation = 4
    }
    io(INPUT) {
        index = 0
        position = -1 to 2
        rotation = 3
    }
    io(OUTPUT) {
        index = 1
        position = 7 to -5
        rotation = 4
    }
    io(OUTPUT) {
        index = 2
        position = 9 to -3
        rotation = -1
    }
    io(OUTPUT) {
        index = 3
        position = 5 to -3
        rotation = 1
    }
    tape {
        parallel(
        {
            sequence(1) {
                wait(2)
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
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(4) {
                wait(6)
                extendTape()
                wait(1)
                grab()
                extend()
                drop()
                retract()
            }
        }
        , 
        {
            sequence(5) {
                wait(6)
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(2) {
                wait(4)
                grab()
                pivotClockwise()
                drop()
            }
        }
        )
    }
}
