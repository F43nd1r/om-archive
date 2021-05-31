
solution {
    puzzle = "P095"
    name = "OVERLAP"
    arm(PISTON) {
        number = 1
        position = 1 to -2
        rotation = 1
        size = 1
    }
    glyph(BONDER) {
        position = 1 to -3
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 0 to -1
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 0 to -2
        rotation = -1
    }
    glyph(PROJECTION) {
        position = 1 to -1
        rotation = -2
    }
    glyph(PROJECTION) {
        position = 2 to -3
        rotation = -4
    }
    glyph(PROJECTION) {
        position = 2 to -2
        rotation = -3
    }
    glyph(PROJECTION) {
        position = 1 to -1
        rotation = -1
    }
    glyph(PURIFICATION) {
        position = 0 to -2
        rotation = 7
    }
    glyph(EQUILIBRIUM) {
        position = 1 to 0
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 1 to -3
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 1 to -1
        rotation = -3
    }
    track {
        position = 1 to -2
        positions = listOf(0 to 0, -1 to 0)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                forward()
                grab()
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                extend()
                drop()
                retract()
                rotateCounterClockwise()
                forward()
                grab()
                back()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                rotateClockwise()
                forward()
                grab()
                rotateClockwise()
                rotateClockwise()
                back()
                rotateClockwise()
                reset()
                wait(2)
                extend()
                grab()
                retract()
            }
        }
        )
    }
}
