
solution {
    puzzle = "P030b"
    name = "NEW SOLUTION 3 (Copy)"
    arm(ARM6) {
        number = 1
        position = -6 to 1
        rotation = 1
        size = 1
    }
    arm(ARM6) {
        number = 2
        position = -5 to 3
        rotation = 2
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = -4 to -1
        rotation = 2
        size = 3
    }
    arm(ARM1) {
        number = 4
        position = -2 to 3
        rotation = 3
        size = 2
    }
    glyph(BONDER) {
        position = -7 to 1
        rotation = 1
    }
    glyph(BONDER) {
        position = -4 to 2
        rotation = 1
    }
    glyph(BONDER) {
        position = -2 to 1
        rotation = 2
    }
    glyph(CALCIFICATION) {
        position = -6 to 0
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -5 to 4
        rotation = 0
    }
    glyph(ANIMISMUS) {
        position = -6 to 2
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -5 to 0
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -1 to 0
        rotation = -6
    }
    io(INPUT) {
        index = 1
        position = -6 to 4
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                drop()
                grab()
                rotateClockwise()
                drop()
                grab()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                drop()
                wait(2)
                extendTape()
            }
        }
        , 
        {
            sequence(2) {
                grab()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                drop()
                grab()
                rotateClockwise()
                drop()
                grab()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(3) {
                wait(12)
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
            }
        }
        , 
        {
            sequence(4) {
                wait(12)
                grab()
                rotateCounterClockwise()
                pivotClockwise()
                rotateCounterClockwise()
                pivotClockwise()
                rotateClockwise()
                rotateCounterClockwise()
                pivotCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
            }
        }
        )
    }
}
