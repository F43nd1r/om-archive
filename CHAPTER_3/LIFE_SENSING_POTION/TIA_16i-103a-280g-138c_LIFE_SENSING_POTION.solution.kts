
solution {
    puzzle = "P030b"
    name = "NEW SOLUTION 5 (Copy) (Copy) (Copy) (Copy) (Copy) (Copy) (Copy)"
    arm(ARM3) {
        number = 1
        position = 4 to 2
        rotation = 5
        size = 2
    }
    arm(ARM3) {
        number = 2
        position = 3 to 0
        rotation = 2
        size = 1
    }
    arm(ARM3) {
        number = 3
        position = 3 to -1
        rotation = 2
        size = 3
    }
    arm(ARM3) {
        number = 4
        position = -1 to 2
        rotation = -3
        size = 2
    }
    arm(ARM6) {
        number = 5
        position = -3 to 3
        rotation = 7
        size = 1
    }
    glyph(BONDER) {
        position = 0 to 1
        rotation = 1
    }
    glyph(BONDER) {
        position = 1 to 0
        rotation = 0
    }
    glyph(BONDER) {
        position = 1 to -4
        rotation = -1
    }
    glyph(BONDER) {
        position = -3 to 2
        rotation = 0
    }
    glyph(MULTI_BONDER) {
        position = -1 to 0
        rotation = 1
    }
    glyph(CALCIFICATION) {
        position = 1 to -1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 2 to 4
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 1 to -3
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 3 to -5
        rotation = 0
    }
    glyph(ANIMISMUS) {
        position = 3 to 1
        rotation = 8
    }
    io(OUTPUT) {
        index = 0
        position = 7 to -4
        rotation = 4
    }
    io(INPUT) {
        index = 0
        position = -2 to 3
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 4 to 4
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
                wait(16)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(3) {
                wait(4)
                grab()
                rotateCounterClockwise()
                pivotCounterClockwise()
                drop()
                extendTape()
            }
        }
        , 
        {
            sequence(2) {
                wait(3)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(5) {
                wait(9)
                grab()
                rotateClockwise()
                drop()
            }
        }
        )
    }
}
