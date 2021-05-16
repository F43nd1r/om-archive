
solution {
    puzzle = "P032"
    name = "NEW SOLUTION 19"
    arm(ARM1) {
        number = 1
        position = 2 to 0
        rotation = 0
        size = 1
    }
    glyph(BONDER) {
        position = 1 to 0
        rotation = 0
    }
    glyph(BONDER) {
        position = 2 to 0
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 3 to -1
        rotation = 0
    }
    glyph(ANIMISMUS) {
        position = 2 to -1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 2 to 0
        rotation = 3
    }
    io(INPUT) {
        index = 1
        position = 3 to 0
        rotation = 0
    }
    io(OUTPUT) {
        index = 1
        position = 2 to 0
        rotation = 0
    }
    track {
        position = 3 to -2
        positions = listOf(-2 to 1, -2 to 2, -1 to 2, -1 to 1, -1 to 0)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                back()
                back()
                drop()
                forward()
                forward()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateClockwise()
                pivotClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                forward()
                drop()
                rotateCounterClockwise()
                back()
                grab()
                forward()
                drop()
                forward()
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                back()
                back()
                grab()
                back()
                back()
                drop()
                forward()
                forward()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateClockwise()
                pivotClockwise()
                drop()
                forward()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
            }
        }
        )
    }
}
