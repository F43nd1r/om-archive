
solution {
    puzzle = "P030b"
    name = "NEW SOLUTION 5 (Copy) (Copy) (Copy) (Copy) (Copy) (Copy) (Copy) (Copy)"
    arm(ARM3) {
        number = 1
        position = 3 to 1
        rotation = 5
        size = 2
    }
    arm(ARM3) {
        number = 2
        position = -2 to 1
        rotation = -6
        size = 2
    }
    arm(ARM3) {
        number = 3
        position = 2 to -1
        rotation = 2
        size = 1
    }
    arm(ARM6) {
        number = 4
        position = -4 to 2
        rotation = 0
        size = 1
    }
    arm(ARM3) {
        number = 5
        position = 2 to -2
        rotation = 2
        size = 3
    }
    glyph(BONDER) {
        position = -1 to 0
        rotation = 1
    }
    glyph(BONDER) {
        position = 0 to -1
        rotation = 0
    }
    glyph(BONDER) {
        position = -4 to 1
        rotation = 0
    }
    glyph(BONDER) {
        position = -2 to -1
        rotation = -1
    }
    glyph(BONDER) {
        position = -3 to 0
        rotation = -2
    }
    glyph(CALCIFICATION) {
        position = 1 to 3
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -5 to 2
        rotation = 0
    }
    glyph(ANIMISMUS) {
        position = 2 to 0
        rotation = 8
    }
    io(INPUT) {
        index = 0
        position = -5 to 3
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 2 to -6
        rotation = 2
    }
    io(INPUT) {
        index = 1
        position = 3 to 3
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
            sequence(5) {
                wait(4)
                grab()
                pivotCounterClockwise()
                rotateCounterClockwise()
                drop()
                extendTape()
            }
        }
        , 
        {
            sequence(3) {
                wait(3)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(2) {
                wait(1)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        , 
        {
            sequence(4) {
                wait(4)
                grab()
                rotateCounterClockwise()
                drop()
            }
        }
        )
    }
}
