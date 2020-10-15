
solution {
    puzzle = "P078"
    name = "B X S"
    arm(ARM1) {
        number = 1
        position = -2 to 3
        rotation = 3
        size = 2
    }
    arm(ARM1) {
        number = 2
        position = -4 to 1
        rotation = 1
        size = 2
    }
    arm(ARM1) {
        number = 3
        position = 1 to 0
        rotation = 2
        size = 2
    }
    arm(ARM1) {
        number = 4
        position = 2 to -1
        rotation = 3
        size = 2
    }
    glyph(BONDER) {
        position = -2 to 0
        rotation = -1
    }
    glyph(UNBONDER) {
        position = -2 to 2
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -3 to 2
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = -3 to 1
        rotation = 0
    }
    glyph(ANIMISMUS) {
        position = 0 to 0
        rotation = 2
    }
    io(INPUT) {
        index = 0
        position = -4 to 3
        rotation = -2
    }
    io(OUTPUT) {
        index = 0
        position = -1 to -2
        rotation = 6
    }
    track {
        position = 0 to 2
        positions = listOf(0 to 0, -1 to 1, -2 to 1)
    }
    track {
        position = -4 to 0
        positions = listOf(0 to 0, 0 to 1)
    }
    track {
        position = 1 to -1
        positions = listOf(0 to 0, 0 to 1, 1 to 0)
    }
    conduit {
        id = 100
        position = 1 to 1
        rotation = 0
    }
    conduit {
        id = 100
        position = 2 to 2
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                back()
                pivotCounterClockwise()
                pivotCounterClockwise()
                back()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                wait(4)
                grab()
                rotateClockwise()
                back()
                reset()
                wait(2)
                grab()
                rotateClockwise()
                back()
                pivotClockwise()
                pivotClockwise()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                wait(5)
                grab()
                back()
                drop()
                back()
                grab()
                back()
                rotateCounterClockwise()
                back()
                reset()
            }
        }
        , 
        {
            sequence(4) {
                wait(7)
                back()
                grab()
                back()
                back()
                pivotCounterClockwise()
                pivotCounterClockwise()
                wait(1)
                pivotClockwise()
                pivotCounterClockwise()
                reset()
            }
        }
        )
    }
}
