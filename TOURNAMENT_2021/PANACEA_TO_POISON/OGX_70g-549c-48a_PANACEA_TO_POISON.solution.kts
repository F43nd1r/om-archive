
solution {
    puzzle = "w2450511665"
    name = "OG"
    arm(ARM1) {
        number = 1
        position = 2 to -1
        rotation = 1
        size = 1
    }
    glyph(BONDER) {
        position = 1 to -1
        rotation = -1
    }
    glyph(UNBONDER) {
        position = 4 to -1
        rotation = -3
    }
    glyph(ANIMISMUS) {
        position = 3 to -1
        rotation = -7
    }
    glyph(DISPOSAL) {
        position = 4 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 1 to 0
        rotation = 1
    }
    io(OUTPUT) {
        index = 0
        position = 1 to -1
        rotation = -3
    }
    track {
        position = 2 to -1
        positions = listOf(0 to 0, 1 to 0)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateClockwise()
                rotateClockwise()
                rotateCounterClockwise()
                pivotClockwise()
                pivotClockwise()
                rotateClockwise()
                forward()
                drop()
                rotateCounterClockwise()
                grab()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                rotateClockwise()
                back()
                drop()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                rotateClockwise()
                grab()
                pivotClockwise()
                pivotClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                pivotClockwise()
                pivotClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                rotateClockwise()
                grab()
                pivotClockwise()
                pivotClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                rotateCounterClockwise()
                pivotClockwise()
                pivotClockwise()
                rotateClockwise()
                forward()
                drop()
                rotateCounterClockwise()
                grab()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                rotateClockwise()
                back()
                drop()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                grab()
                pivotClockwise()
                pivotClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                reset()
            }
        }
        )
    }
}
