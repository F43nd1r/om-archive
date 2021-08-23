
solution {
    puzzle = "P030b"
    name = "NEW SOLUTION 3 (Copy) (Copy)"
    arm(ARM6) {
        number = 1
        position = 0 to -2
        rotation = -10
        size = 1
    }
    arm(ARM6) {
        number = 2
        position = -2 to 1
        rotation = -9
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = 2 to -3
        rotation = -10
        size = 2
    }
    arm(ARM1) {
        number = 4
        position = 1 to 2
        rotation = -9
        size = 3
    }
    glyph(BONDER) {
        position = 0 to -3
        rotation = -10
    }
    glyph(BONDER) {
        position = -1 to 1
        rotation = -10
    }
    glyph(BONDER) {
        position = 0 to 1
        rotation = -6
    }
    glyph(CALCIFICATION) {
        position = -3 to 2
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 1 to -3
        rotation = 0
    }
    glyph(ANIMISMUS) {
        position = -1 to 0
        rotation = -14
    }
    io(INPUT) {
        index = 0
        position = 1 to -2
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 1 to 0
        rotation = -13
    }
    io(INPUT) {
        index = 1
        position = -3 to 1
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
                rotateClockwise()
                drop()
                wait(1)
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
                wait(13)
                grab()
                rotateClockwise()
                pivotClockwise()
                drop()
                rotateCounterClockwise()
            }
        }
        , 
        {
            sequence(4) {
                wait(12)
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                rotateCounterClockwise()
                rotateClockwise()
                rotateCounterClockwise()
                pivotClockwise()
                drop()
                rotateClockwise()
            }
        }
        )
    }
}
