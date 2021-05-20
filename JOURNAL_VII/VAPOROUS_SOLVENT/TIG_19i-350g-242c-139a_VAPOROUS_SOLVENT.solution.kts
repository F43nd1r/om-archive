
solution {
    puzzle = "P098"
    name = "INSTR"
    arm(ARM6) {
        number = 1
        position = -7 to 5
        rotation = -1
        size = 1
    }
    arm(VAN_BERLOS_WHEEL) {
        number = 2
        position = -5 to -2
        rotation = 1
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = -2 to -4
        rotation = 1
        size = 2
    }
    arm(ARM1) {
        number = 4
        position = -3 to 3
        rotation = -3
        size = 3
    }
    arm(ARM1) {
        number = 5
        position = -3 to -3
        rotation = 1
        size = 3
    }
    arm(ARM1) {
        number = 6
        position = 3 to 0
        rotation = 2
        size = 3
    }
    glyph(BONDER) {
        position = -3 to -1
        rotation = 1
    }
    glyph(BONDER) {
        position = -1 to 1
        rotation = 10
    }
    glyph(BONDER) {
        position = 1 to 0
        rotation = 8
    }
    glyph(BONDER) {
        position = 1 to 1
        rotation = 1
    }
    glyph(BONDER) {
        position = -2 to 4
        rotation = 5
    }
    glyph(BONDER) {
        position = 1 to 4
        rotation = 3
    }
    glyph(BONDER) {
        position = 0 to -1
        rotation = 6
    }
    glyph(UNBONDER) {
        position = 0 to 2
        rotation = 1
    }
    glyph(UNBONDER) {
        position = 2 to 2
        rotation = 1
    }
    glyph(UNBONDER) {
        position = 5 to 2
        rotation = 3
    }
    glyph(UNBONDER) {
        position = 6 to -1
        rotation = 1
    }
    glyph(UNBONDER) {
        position = 3 to 3
        rotation = 7
    }
    glyph(UNBONDER) {
        position = 7 to 1
        rotation = 4
    }
    glyph(CALCIFICATION) {
        position = -1 to 4
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 1 to 3
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = -4 to -2
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = -2 to 0
        rotation = 4
    }
    glyph(PURIFICATION) {
        position = -6 to 4
        rotation = -3
    }
    io(INPUT) {
        index = 0
        position = -2 to -3
        rotation = 1
    }
    io(OUTPUT) {
        index = 0
        position = 6 to -3
        rotation = 1
    }
    io(INPUT) {
        index = 1
        position = -8 to 5
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(4) {
                wait(9)
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
            }
        }
        , 
        {
            sequence(3) {
                wait(7)
                grab()
                pivotClockwise()
                pivotClockwise()
                drop()
                wait(1)
                extendTape()
            }
        }
        , 
        {
            sequence(5) {
                wait(11)
                grab()
                pivotCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(2) {
                wait(9)
                rotateCounterClockwise()
            }
        }
        , 
        {
            sequence(6) {
                wait(11)
                grab()
                rotateClockwise()
                drop()
            }
        }
        )
    }
}
