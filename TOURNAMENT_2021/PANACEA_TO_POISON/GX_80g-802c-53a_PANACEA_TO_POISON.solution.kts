
solution {
    puzzle = "w2450511665"
    name = "G"
    arm(ARM1) {
        number = 1
        position = -2 to -1
        rotation = 3
        size = 2
    }
    glyph(BONDER) {
        position = 0 to -3
        rotation = -1
    }
    glyph(UNBONDER) {
        position = -5 to 1
        rotation = -1
    }
    glyph(ANIMISMUS) {
        position = 0 to -2
        rotation = -5
    }
    glyph(DISPOSAL) {
        position = -3 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -3 to -3
        rotation = -4
    }
    io(OUTPUT) {
        index = 0
        position = -1 to -5
        rotation = -3
    }
    track {
        position = -3 to -1
        positions = listOf(0 to 0, 1 to 0, 2 to -1, 1 to -1)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                back()
                pivotCounterClockwise()
                rotateClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                forward()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                forward()
                forward()
                rotateClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                rotateClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                grab()
                pivotClockwise()
                pivotClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                back()
                grab()
                forward()
                rotateClockwise()
                rotateClockwise()
                forward()
                drop()
                back()
                grab()
                rotateCounterClockwise()
                reset()
                wait(3)
                grab()
                back()
                pivotCounterClockwise()
                rotateClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                forward()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                forward()
                forward()
                rotateClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                rotateClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                grab()
                pivotClockwise()
                pivotClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                back()
                grab()
                forward()
                rotateClockwise()
                rotateClockwise()
                forward()
                drop()
                forward()
                grab()
                rotateClockwise()
                reset()
                wait(3)
                grab()
                back()
                pivotCounterClockwise()
                rotateClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                back()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                rotateCounterClockwise()
                forward()
                pivotClockwise()
                back()
                drop()
                forward()
                forward()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                rotateCounterClockwise()
                pivotCounterClockwise()
                rotateClockwise()
                forward()
                drop()
                forward()
                rotateCounterClockwise()
                grab()
                rotateCounterClockwise()
                reset()
            }
        }
        )
    }
}
