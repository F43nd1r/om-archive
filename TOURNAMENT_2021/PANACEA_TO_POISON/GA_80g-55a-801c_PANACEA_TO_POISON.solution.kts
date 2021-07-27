
solution {
    puzzle = "w2450511665"
    name = "G"
    arm(ARM1) {
        number = 1
        position = 0 to -1
        rotation = 0
        size = 2
    }
    glyph(BONDER) {
        position = 2 to -4
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 1 to 1
        rotation = 3
    }
    glyph(ANIMISMUS) {
        position = -1 to -2
        rotation = 1
    }
    glyph(DISPOSAL) {
        position = -2 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 3 to 0
        rotation = -2
    }
    io(OUTPUT) {
        index = 0
        position = 4 to -3
        rotation = -4
    }
    track {
        position = 0 to -1
        positions = listOf(0 to 0, 1 to 0, 2 to -1, 1 to -1)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                pivotClockwise()
                pivotClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                pivotClockwise()
                pivotClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                forward()
                forward()
                rotateClockwise()
                grab()
                pivotClockwise()
                pivotClockwise()
                back()
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                back()
                pivotCounterClockwise()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                forward()
                grab()
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                back()
                drop()
                forward()
                grab()
                rotateClockwise()
                reset()
                wait(2)
                grab()
                pivotClockwise()
                pivotClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                pivotClockwise()
                pivotClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                forward()
                forward()
                rotateClockwise()
                grab()
                pivotClockwise()
                pivotClockwise()
                back()
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                back()
                pivotCounterClockwise()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                forward()
                grab()
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                back()
                drop()
                back()
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                forward()
                forward()
                grab()
                rotateClockwise()
                reset()
                wait(2)
                grab()
                pivotClockwise()
                pivotClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                pivotClockwise()
                pivotClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                forward()
                rotateClockwise()
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                forward()
                forward()
                drop()
                back()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
            }
        }
        )
    }
}
