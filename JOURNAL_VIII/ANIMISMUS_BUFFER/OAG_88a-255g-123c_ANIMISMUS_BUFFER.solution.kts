
solution {
    puzzle = "P104"
    name = "SUM4 540 ALT"
    arm(ARM1) {
        number = 1
        position = -1 to 1
        rotation = 11
        size = 2
    }
    arm(ARM1) {
        number = 2
        position = -4 to 2
        rotation = -1
        size = 2
    }
    arm(ARM1) {
        number = 3
        position = 1 to 0
        rotation = 10
        size = 1
    }
    arm(ARM1) {
        number = 4
        position = 0 to 1
        rotation = 11
        size = 3
    }
    arm(ARM1) {
        number = 5
        position = 1 to 1
        rotation = 5
        size = 2
    }
    glyph(BONDER) {
        position = 3 to 1
        rotation = 8
    }
    glyph(BONDER) {
        position = 3 to 0
        rotation = 5
    }
    glyph(BONDER) {
        position = 0 to 3
        rotation = 6
    }
    glyph(BONDER) {
        position = -2 to -1
        rotation = 7
    }
    glyph(BONDER) {
        position = -4 to 4
        rotation = 10
    }
    glyph(UNBONDER) {
        position = -1 to 0
        rotation = 5
    }
    glyph(CALCIFICATION) {
        position = 3 to 2
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 2 to 0
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = 3 to -2
        rotation = 8
    }
    glyph(ANIMISMUS) {
        position = -1 to 2
        rotation = 8
    }
    io(INPUT) {
        index = 0
        position = 1 to -2
        rotation = 4
    }
    io(OUTPUT) {
        index = 0
        position = 0 to 5
        rotation = 0
    }
    track {
        position = 0 to 0
        positions = listOf(1 to 1, 0 to 2, 0 to 1)
    }
    track {
        position = -2 to 1
        positions = listOf(-2 to 1, -1 to 1, 0 to 0, 1 to 0)
    }
    tape {
        parallel(
        {
            sequence(3) {
                wait(3)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                grab()
                pivotClockwise()
                rotateCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                reset()
                wait(1)
                grab()
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(4) {
                wait(8)
                grab()
                rotateCounterClockwise()
                back()
                drop()
                rotateClockwise()
                forward()
                wait(2)
                grab()
                pivotClockwise()
                pivotClockwise()
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                back()
                drop()
                rotateClockwise()
                rotateClockwise()
                back()
            }
        }
        , 
        {
            sequence(5) {
                wait(12)
                grab()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                back()
                wait(3)
                rotateCounterClockwise()
                wait(1)
                rotateClockwise()
                back()
                drop()
                back()
                reset()
            }
        }
        , 
        {
            sequence(1) {
                grab()
                pivotClockwise()
                rotateClockwise()
                back()
                drop()
                rotateCounterClockwise()
                back()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                wait(10)
                forward()
                grab()
                rotateCounterClockwise()
                drop()
                back()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                wait(6)
                rotateClockwise()
                reset()
            }
        }
        )
    }
}
