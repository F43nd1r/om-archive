
solution {
    puzzle = "P032"
    name = "B AG"
    arm(PISTON) {
        number = 1
        position = 2 to -3
        rotation = 4
        size = 1
    }
    glyph(BONDER) {
        position = 1 to -2
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 1 to -3
        rotation = 0
    }
    glyph(ANIMISMUS) {
        position = 4 to -3
        rotation = -3
    }
    io(OUTPUT) {
        index = 0
        position = 3 to -1
        rotation = 2
    }
    io(OUTPUT) {
        index = 1
        position = 1 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 2 to -4
        rotation = 0
    }
    track {
        position = 2 to -3
        positions = listOf(0 to 0, 1 to -1)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateClockwise()
                rotateClockwise()
                reset()
                wait(2)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                extend()
                reset()
                wait(3)
                grab()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                extend()
                reset()
                wait(3)
                grab()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                forward()
                drop()
                extend()
                grab()
                rotateCounterClockwise()
                drop()
                retract()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                back()
                forward()
                extend()
                drop()
                rotateCounterClockwise()
                back()
                grab()
                forward()
                back()
                reset()
                wait(3)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                forward()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                back()
                rotateClockwise()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                grab()
                rotateClockwise()
                back()
                rotateClockwise()
                reset()
                wait(3)
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                rotateClockwise()
                grab()
                extend()
                extend()
                reset()
            }
        }
        )
    }
}
