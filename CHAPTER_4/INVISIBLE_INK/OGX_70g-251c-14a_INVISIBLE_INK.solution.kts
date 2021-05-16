
solution {
    puzzle = "P032"
    name = "OG (Copy)"
    arm(ARM1) {
        number = 1
        position = -7 to -3
        rotation = -4
        size = 1
    }
    glyph(BONDER) {
        position = -8 to -2
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -8 to -3
        rotation = 0
    }
    glyph(ANIMISMUS) {
        position = -7 to -3
        rotation = -1
    }
    io(INPUT) {
        index = 0
        position = -8 to -2
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -7 to -2
        rotation = 3
    }
    io(OUTPUT) {
        index = 1
        position = -7 to -2
        rotation = 6
    }
    track {
        position = -8 to -3
        positions = listOf(0 to 0, 1 to 0)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                forward()
                grab()
                rotateCounterClockwise()
                back()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                forward()
                rotateClockwise()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                back()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                forward()
                rotateClockwise()
                rotateCounterClockwise()
                reset()
            }
        }
        )
    }
}
