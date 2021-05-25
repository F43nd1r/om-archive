
solution {
    puzzle = "P032"
    name = "OVERLAP AG"
    arm(PISTON) {
        number = 1
        position = -1 to 0
        rotation = -2
        size = 1
    }
    glyph(BONDER) {
        position = -2 to 0
        rotation = 1
    }
    glyph(BONDER) {
        position = -2 to 1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -2 to 0
        rotation = 0
    }
    glyph(ANIMISMUS) {
        position = -2 to 1
        rotation = -1
    }
    io(OUTPUT) {
        index = 0
        position = -1 to 1
        rotation = 3
    }
    io(INPUT) {
        index = 1
        position = -1 to -1
        rotation = 0
    }
    io(OUTPUT) {
        index = 1
        position = -1 to 1
        rotation = 6
    }
    track {
        position = 0 to 1
        positions = listOf(0 to 0, -1 to 0, -1 to -1, -2 to -1)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                back()
                rotateCounterClockwise()
                drop()
                back()
                grab()
                rotateClockwise()
                extend()
                drop()
                retract()
                grab()
                rotateCounterClockwise()
                drop()
                forward()
                forward()
                grab()
                back()
                rotateClockwise()
                drop()
                forward()
                grab()
                rotateClockwise()
                drop()
                rotateClockwise()
                forward()
                grab()
                back()
                drop()
                forward()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                forward()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                back()
                rotateCounterClockwise()
                drop()
                forward()
                grab()
                back()
                drop()
                forward()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                back()
                rotateCounterClockwise()
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
