
solution {
    puzzle = "P096"
    name = "OVERLAP AREA (Copy)"
    arm(ARM1) {
        number = 1
        position = 2 to -2
        rotation = -3
        size = 1
    }
    glyph(BONDER) {
        position = 1 to -2
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 0 to -1
        rotation = -1
    }
    glyph(UNBONDER) {
        position = 0 to -2
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 1 to -3
        rotation = 1
    }
    glyph(UNBONDER) {
        position = 2 to -3
        rotation = 2
    }
    glyph(CALCIFICATION) {
        position = 2 to -2
        rotation = 0
    }
    glyph(DISPOSAL) {
        position = 1 to -2
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 2 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 1 to -2
        rotation = 6
    }
    io(OUTPUT) {
        index = 1
        position = 1 to -2
        rotation = 0
    }
    io(OUTPUT) {
        index = 2
        position = 2 to -2
        rotation = -3
    }
    io(OUTPUT) {
        index = 3
        position = 2 to -2
        rotation = -1
    }
    track {
        position = 0 to -1
        positions = listOf(2 to -1, 2 to -2, 1 to -1)
    }
    tape {
        parallel(
        {
            sequence(1) {
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                forward()
                rotateClockwise()
                forward()
                drop()
                rotateCounterClockwise()
                grab()
                back()
                rotateClockwise()
                rotateCounterClockwise()
                forward()
                drop()
                rotateClockwise()
                grab()
                back()
                drop()
                rotateCounterClockwise()
                forward()
                grab()
                back()
                drop()
                rotateClockwise()
                grab()
                pivotClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                forward()
                grab()
                forward()
                drop()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                back()
                grab()
                back()
                rotateClockwise()
                drop()
                forward()
                grab()
                rotateCounterClockwise()
                back()
                forward()
                drop()
                back()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                forward()
                grab()
                back()
                pivotClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                forward()
                rotateCounterClockwise()
                grab()
                forward()
                drop()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                forward()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                forward()
                grab()
                back()
                forward()
                drop()
                back()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                forward()
                grab()
                back()
                pivotClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                forward()
                rotateCounterClockwise()
                grab()
                forward()
                drop()
            }
        }
        )
    }
}
