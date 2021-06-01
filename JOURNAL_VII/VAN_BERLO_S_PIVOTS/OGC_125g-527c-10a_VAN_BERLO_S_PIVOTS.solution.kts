
solution {
    puzzle = "P096"
    name = "OVERLAP AREA"
    arm(PISTON) {
        number = 1
        position = 0 to -1
        rotation = 6
        size = 1
    }
    glyph(BONDER) {
        position = 2 to -2
        rotation = 1
    }
    glyph(BONDER) {
        position = 2 to -2
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 1 to -1
        rotation = -1
    }
    glyph(UNBONDER) {
        position = 1 to -2
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 2 to -3
        rotation = 1
    }
    glyph(UNBONDER) {
        position = 3 to -3
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
    io(INPUT) {
        index = 0
        position = 2 to -2
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 2 to -2
        rotation = -2
    }
    io(OUTPUT) {
        index = 1
        position = 2 to -2
        rotation = 0
    }
    io(OUTPUT) {
        index = 2
        position = 2 to -2
        rotation = -5
    }
    io(OUTPUT) {
        index = 3
        position = 2 to -2
        rotation = -3
    }
    track {
        position = 0 to -4
        positions = listOf(1 to 1, 1 to 2, 0 to 3)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                back()
                forward()
                drop()
                back()
                back()
                grab()
                forward()
                drop()
                back()
                extend()
                grab()
                forward()
                drop()
                forward()
                retract()
                grab()
                extend()
                drop()
                retract()
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                back()
                back()
                grab()
                forward()
                forward()
                drop()
                back()
                back()
                extend()
                grab()
                forward()
                retract()
                drop()
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                extend()
                forward()
                drop()
                forward()
                retract()
                grab()
                extend()
                drop()
                retract()
                grab()
                back()
                forward()
                rotateClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                back()
                back()
                extend()
                grab()
                forward()
                retract()
                extend()
                drop()
                retract()
                back()
                grab()
                rotateCounterClockwise()
                forward()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                forward()
                grab()
                extend()
                reset()
            }
        }
        )
    }
}
