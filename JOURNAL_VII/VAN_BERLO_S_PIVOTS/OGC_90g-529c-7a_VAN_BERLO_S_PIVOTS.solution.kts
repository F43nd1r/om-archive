
solution {
    puzzle = "P096"
    name = "OAG"
    arm(ARM1) {
        number = 1
        position = 1 to -2
        rotation = 0
        size = 1
    }
    glyph(BONDER) {
        position = 0 to -1
        rotation = -1
    }
    glyph(UNBONDER) {
        position = 1 to -3
        rotation = 1
    }
    glyph(UNBONDER) {
        position = 1 to -2
        rotation = -1
    }
    glyph(UNBONDER) {
        position = 1 to -2
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 1 to -2
        rotation = 1
    }
    glyph(CALCIFICATION) {
        position = 0 to -2
        rotation = 0
    }
    glyph(DISPOSAL) {
        position = 1 to -2
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 1 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 1 to -2
        rotation = 0
    }
    io(OUTPUT) {
        index = 1
        position = 0 to -1
        rotation = -1
    }
    io(OUTPUT) {
        index = 2
        position = 0 to -1
        rotation = 0
    }
    io(OUTPUT) {
        index = 3
        position = 0 to -1
        rotation = 2
    }
    track {
        position = 0 to -2
        positions = listOf(0 to 0, 1 to 0)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                back()
                rotateCounterClockwise()
                drop()
                forward()
                grab()
                rotateClockwise()
                back()
                drop()
                rotateCounterClockwise()
                grab()
                pivotCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                forward()
                rotateClockwise()
                grab()
                rotateClockwise()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                back()
                grab()
                rotateCounterClockwise()
                drop()
                forward()
                rotateClockwise()
                grab()
                back()
                rotateCounterClockwise()
                drop()
                forward()
                rotateCounterClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateClockwise()
                drop()
                rotateClockwise()
                back()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                pivotCounterClockwise()
                drop()
                rotateClockwise()
                forward()
                grab()
                back()
                drop()
                forward()
                rotateClockwise()
                grab()
                back()
                rotateCounterClockwise()
                drop()
                forward()
                rotateCounterClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                back()
                drop()
                rotateCounterClockwise()
                grab()
                pivotCounterClockwise()
                drop()
                forward()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                back()
                drop()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                forward()
            }
        }
        )
    }
}
