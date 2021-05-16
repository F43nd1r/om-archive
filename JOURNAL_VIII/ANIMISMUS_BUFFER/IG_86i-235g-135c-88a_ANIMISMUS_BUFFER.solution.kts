
solution {
    puzzle = "P104"
    name = "B F"
    arm(ARM1) {
        number = 1
        position = 2 to 0
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = 4 to -3
        rotation = 1
        size = 2
    }
    arm(ARM1) {
        number = 3
        position = 2 to -1
        rotation = 1
        size = 2
    }
    arm(ARM1) {
        number = 4
        position = 1 to -1
        rotation = 1
        size = 3
    }
    arm(ARM1) {
        number = 5
        position = 1 to -4
        rotation = 1
        size = 2
    }
    glyph(BONDER) {
        position = 0 to -3
        rotation = 2
    }
    glyph(BONDER) {
        position = 0 to -1
        rotation = 2
    }
    glyph(BONDER) {
        position = 5 to -3
        rotation = 1
    }
    glyph(BONDER) {
        position = 0 to 3
        rotation = 1
    }
    glyph(BONDER) {
        position = -1 to 2
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 4 to -2
        rotation = 1
    }
    glyph(CALCIFICATION) {
        position = -2 to 3
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = 2 to 2
        rotation = 4
    }
    glyph(ANIMISMUS) {
        position = 2 to -2
        rotation = 4
    }
    io(OUTPUT) {
        index = 0
        position = -3 to -1
        rotation = 1
    }
    io(INPUT) {
        index = 0
        position = 4 to 0
        rotation = 0
    }
    track {
        position = 4 to -4
        positions = listOf(0 to 0, 0 to 1)
    }
    track {
        position = 1 to -1
        positions = listOf(0 to 0, 0 to 1, 1 to 0)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                pivotClockwise()
                reset()
                wait(1)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                grab()
                pivotClockwise()
                pivotCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
                wait(2)
                grab()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                wait(2)
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                back()
                drop()
                rotateCounterClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                reset()
                wait(2)
                back()
                grab()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(3) {
                wait(9)
                grab()
                rotateCounterClockwise()
                back()
                pivotClockwise()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                back()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                back()
                rotateClockwise()
                rotateClockwise()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(4) {
                wait(17)
                back()
                grab()
                pivotClockwise()
                pivotClockwise()
                back()
                wait(1)
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                back()
                grab()
                rotateClockwise()
                rotateCounterClockwise()
                drop()
                back()
                grab()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(5) {
                wait(19)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                wait(3)
                rotateClockwise()
                pivotCounterClockwise()
                drop()
                wait(2)
                grab()
                pivotCounterClockwise()
                reset()
            }
        }
        )
    }
}
