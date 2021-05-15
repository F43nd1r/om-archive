
solution {
    puzzle = "P042"
    name = "NEW SOLUTION 2"
    arm(PISTON) {
        number = 1
        position = 1 to -1
        rotation = -6
        size = 1
    }
    glyph(BONDER) {
        position = 1 to 1
        rotation = -7
    }
    glyph(BONDER) {
        position = 1 to 1
        rotation = -6
    }
    glyph(BONDER) {
        position = 3 to -1
        rotation = -4
    }
    glyph(BONDER) {
        position = 3 to 1
        rotation = -3
    }
    glyph(BONDER) {
        position = 2 to -1
        rotation = -3
    }
    glyph(BONDER) {
        position = 2 to -2
        rotation = -4
    }
    glyph(BONDER) {
        position = 1 to 1
        rotation = -2
    }
    io(INPUT) {
        index = 0
        position = 2 to -1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 3 to -1
        rotation = -4
    }
    io(INPUT) {
        index = 1
        position = 3 to -1
        rotation = 0
    }
    track {
        position = 0 to -1
        positions = listOf(0 to 0, 1 to 0, 1 to 1, 2 to 1)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                forward()
                forward()
                reset()
                wait(3)
                grab()
                rotateCounterClockwise()
                forward()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                back()
                extend()
                grab()
                pivotClockwise()
                reset()
                wait(1)
                grab()
                rotateCounterClockwise()
                forward()
                forward()
                reset()
                wait(3)
                grab()
                rotateCounterClockwise()
                forward()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                back()
                extend()
                grab()
                pivotClockwise()
                reset()
                wait(1)
                grab()
                rotateCounterClockwise()
                forward()
                forward()
                reset()
                wait(3)
                grab()
                rotateCounterClockwise()
                forward()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                back()
                extend()
                grab()
                pivotClockwise()
                reset()
                wait(1)
                grab()
                rotateCounterClockwise()
                forward()
                forward()
                reset()
                wait(3)
                grab()
                rotateCounterClockwise()
                forward()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                back()
                extend()
                grab()
                pivotClockwise()
                reset()
                wait(1)
                grab()
                rotateCounterClockwise()
                forward()
                forward()
                reset()
                wait(3)
                grab()
                rotateCounterClockwise()
                forward()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                back()
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                grab()
                back()
                drop()
                extend()
                extend()
                grab()
                pivotClockwise()
                reset()
            }
        }
        )
    }
}
